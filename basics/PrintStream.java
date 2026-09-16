// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package java.io;

import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Formatter;
import java.util.Locale;
import java.util.Locale.Category;

public class PrintStream extends FilterOutputStream implements Appendable, Closeable {
   private final boolean autoFlush;
   private boolean trouble;
   private Formatter formatter;
   private BufferedWriter textOut;
   private OutputStreamWriter charOut;
   private boolean closing;

   private static <T> T requireNonNull(T obj, String message) {
      if (obj == null) {
         throw new NullPointerException(message);
      } else {
         return obj;
      }
   }

   private static Charset toCharset(String csn) throws UnsupportedEncodingException {
      requireNonNull(csn, "charsetName");

      try {
         return Charset.forName(csn);
      } catch (UnsupportedCharsetException | IllegalCharsetNameException var2) {
         throw new UnsupportedEncodingException(csn);
      }
   }

   private PrintStream(boolean autoFlush, OutputStream out) {
      super(out);
      this.trouble = false;
      this.closing = false;
      this.autoFlush = autoFlush;
      this.charOut = new OutputStreamWriter(this);
      this.textOut = new BufferedWriter(this.charOut);
   }

   private PrintStream(boolean autoFlush, Charset charset, OutputStream out) {
      this(out, autoFlush, charset);
   }

   public PrintStream(OutputStream out) {
      this(out, false);
   }

   public PrintStream(OutputStream out, boolean autoFlush) {
      this(autoFlush, (OutputStream)requireNonNull(out, "Null output stream"));
   }

   public PrintStream(OutputStream out, boolean autoFlush, String encoding) throws UnsupportedEncodingException {
      this((OutputStream)requireNonNull(out, "Null output stream"), autoFlush, toCharset(encoding));
   }

   public PrintStream(OutputStream out, boolean autoFlush, Charset charset) {
      super(out);
      this.trouble = false;
      this.closing = false;
      this.autoFlush = autoFlush;
      this.charOut = new OutputStreamWriter(this, charset);
      this.textOut = new BufferedWriter(this.charOut);
   }

   public PrintStream(String fileName) throws FileNotFoundException {
      this(false, new FileOutputStream(fileName));
   }

   public PrintStream(String fileName, String csn) throws FileNotFoundException, UnsupportedEncodingException {
      this(false, toCharset(csn), new FileOutputStream(fileName));
   }

   public PrintStream(String fileName, Charset charset) throws IOException {
      this(false, (Charset)requireNonNull(charset, "charset"), new FileOutputStream(fileName));
   }

   public PrintStream(File file) throws FileNotFoundException {
      this(false, new FileOutputStream(file));
   }

   public PrintStream(File file, String csn) throws FileNotFoundException, UnsupportedEncodingException {
      this(false, toCharset(csn), new FileOutputStream(file));
   }

   public PrintStream(File file, Charset charset) throws IOException {
      this(false, (Charset)requireNonNull(charset, "charset"), new FileOutputStream(file));
   }

   private void ensureOpen() throws IOException {
      if (this.out == null) {
         throw new IOException("Stream closed");
      }
   }

   public void flush() {
      synchronized(this) {
         try {
            this.ensureOpen();
            this.out.flush();
         } catch (IOException var4) {
            this.trouble = true;
         }

      }
   }

   public void close() {
      synchronized(this) {
         if (!this.closing) {
            this.closing = true;

            try {
               this.textOut.close();
               this.out.close();
            } catch (IOException var4) {
               this.trouble = true;
            }

            this.textOut = null;
            this.charOut = null;
            this.out = null;
         }

      }
   }

   public boolean checkError() {
      if (this.out != null) {
         this.flush();
      }

      OutputStream var2 = this.out;
      if (var2 instanceof PrintStream ps) {
         return ps.checkError();
      } else {
         return this.trouble;
      }
   }

   protected void setError() {
      this.trouble = true;
   }

   protected void clearError() {
      this.trouble = false;
   }

   public void write(int b) {
      try {
         synchronized(this) {
            this.ensureOpen();
            this.out.write(b);
            if (b == 10 && this.autoFlush) {
               this.out.flush();
            }
         }
      } catch (InterruptedIOException var5) {
         Thread.currentThread().interrupt();
      } catch (IOException var6) {
         this.trouble = true;
      }

   }

   public void write(byte[] buf, int off, int len) {
      try {
         synchronized(this) {
            this.ensureOpen();
            this.out.write(buf, off, len);
            if (this.autoFlush) {
               this.out.flush();
            }
         }
      } catch (InterruptedIOException var7) {
         Thread.currentThread().interrupt();
      } catch (IOException var8) {
         this.trouble = true;
      }

   }

   public void write(byte[] buf) throws IOException {
      this.write(buf, 0, buf.length);
   }

   public void writeBytes(byte[] buf) {
      this.write(buf, 0, buf.length);
   }

   private void write(char[] buf) {
      try {
         synchronized(this) {
            this.ensureOpen();
            this.textOut.write(buf);
            this.textOut.flushBuffer();
            this.charOut.flushBuffer();
            if (this.autoFlush) {
               for(int i = 0; i < buf.length; ++i) {
                  if (buf[i] == '\n') {
                     this.out.flush();
                     break;
                  }
               }
            }
         }
      } catch (InterruptedIOException var6) {
         Thread.currentThread().interrupt();
      } catch (IOException var7) {
         this.trouble = true;
      }

   }

   private void writeln(char[] buf) {
      try {
         synchronized(this) {
            this.ensureOpen();
            this.textOut.write(buf);
            this.textOut.newLine();
            this.textOut.flushBuffer();
            this.charOut.flushBuffer();
            if (this.autoFlush) {
               this.out.flush();
            }
         }
      } catch (InterruptedIOException var5) {
         Thread.currentThread().interrupt();
      } catch (IOException var6) {
         this.trouble = true;
      }

   }

   private void write(String s) {
      try {
         synchronized(this) {
            this.ensureOpen();
            this.textOut.write(s);
            this.textOut.flushBuffer();
            this.charOut.flushBuffer();
            if (this.autoFlush && s.indexOf(10) >= 0) {
               this.out.flush();
            }
         }
      } catch (InterruptedIOException var5) {
         Thread.currentThread().interrupt();
      } catch (IOException var6) {
         this.trouble = true;
      }

   }

   private void writeln(String s) {
      try {
         synchronized(this) {
            this.ensureOpen();
            this.textOut.write(s);
            this.textOut.newLine();
            this.textOut.flushBuffer();
            this.charOut.flushBuffer();
            if (this.autoFlush) {
               this.out.flush();
            }
         }
      } catch (InterruptedIOException var5) {
         Thread.currentThread().interrupt();
      } catch (IOException var6) {
         this.trouble = true;
      }

   }

   private void newLine() {
      try {
         synchronized(this) {
            this.ensureOpen();
            this.textOut.newLine();
            this.textOut.flushBuffer();
            this.charOut.flushBuffer();
            if (this.autoFlush) {
               this.out.flush();
            }
         }
      } catch (InterruptedIOException var4) {
         Thread.currentThread().interrupt();
      } catch (IOException var5) {
         this.trouble = true;
      }

   }

   public void print(boolean b) {
      this.write(String.valueOf(b));
   }

   public void print(char c) {
      this.write(String.valueOf(c));
   }

   public void print(int i) {
      this.write(String.valueOf(i));
   }

   public void print(long l) {
      this.write(String.valueOf(l));
   }

   public void print(float f) {
      this.write(String.valueOf(f));
   }

   public void print(double d) {
      this.write(String.valueOf(d));
   }

   public void print(char[] s) {
      this.write(s);
   }

   public void print(String s) {
      this.write(String.valueOf(s));
   }

   public void print(Object obj) {
      this.write(String.valueOf(obj));
   }

   public void println() {
      this.newLine();
   }

   public void println(boolean x) {
      if (this.getClass() == PrintStream.class) {
         this.writeln(String.valueOf(x));
      } else {
         synchronized(this) {
            this.print(x);
            this.newLine();
         }
      }

   }

   public void println(char x) {
      if (this.getClass() == PrintStream.class) {
         this.writeln(String.valueOf(x));
      } else {
         synchronized(this) {
            this.print(x);
            this.newLine();
         }
      }

   }

   public void println(int x) {
      if (this.getClass() == PrintStream.class) {
         this.writeln(String.valueOf(x));
      } else {
         synchronized(this) {
            this.print(x);
            this.newLine();
         }
      }

   }

   public void println(long x) {
      if (this.getClass() == PrintStream.class) {
         this.writeln(String.valueOf(x));
      } else {
         synchronized(this) {
            this.print(x);
            this.newLine();
         }
      }

   }

   public void println(float x) {
      if (this.getClass() == PrintStream.class) {
         this.writeln(String.valueOf(x));
      } else {
         synchronized(this) {
            this.print(x);
            this.newLine();
         }
      }

   }

   public void println(double x) {
      if (this.getClass() == PrintStream.class) {
         this.writeln(String.valueOf(x));
      } else {
         synchronized(this) {
            this.print(x);
            this.newLine();
         }
      }

   }

   public void println(char[] x) {
      if (this.getClass() == PrintStream.class) {
         this.writeln(x);
      } else {
         synchronized(this) {
            this.print(x);
            this.newLine();
         }
      }

   }

   public void println(String x) {
      if (this.getClass() == PrintStream.class) {
         this.writeln(String.valueOf(x));
      } else {
         synchronized(this) {
            this.print(x);
            this.newLine();
         }
      }

   }

   public void println(Object x) {
      String s = String.valueOf(x);
      if (this.getClass() == PrintStream.class) {
         this.writeln(String.valueOf(s));
      } else {
         synchronized(this) {
            this.print(s);
            this.newLine();
         }
      }

   }

   public PrintStream printf(String format, Object... args) {
      return this.format(format, args);
   }

   public PrintStream printf(Locale l, String format, Object... args) {
      return this.format(l, format, args);
   }

   public PrintStream format(String format, Object... args) {
      try {
         synchronized(this) {
            this.ensureOpen();
            if (this.formatter == null || this.formatter.locale() != Locale.getDefault(Category.FORMAT)) {
               this.formatter = new Formatter(this);
            }

            this.formatter.format(Locale.getDefault(Category.FORMAT), format, args);
         }
      } catch (InterruptedIOException var6) {
         Thread.currentThread().interrupt();
      } catch (IOException var7) {
         this.trouble = true;
      }

      return this;
   }

   public PrintStream format(Locale l, String format, Object... args) {
      try {
         synchronized(this) {
            this.ensureOpen();
            if (this.formatter == null || this.formatter.locale() != l) {
               this.formatter = new Formatter(this, l);
            }

            this.formatter.format(l, format, args);
         }
      } catch (InterruptedIOException var7) {
         Thread.currentThread().interrupt();
      } catch (IOException var8) {
         this.trouble = true;
      }

      return this;
   }

   public PrintStream append(CharSequence csq) {
      this.print(String.valueOf(csq));
      return this;
   }

   public PrintStream append(CharSequence csq, int start, int end) {
      if (csq == null) {
         csq = "null";
      }

      return this.append(csq.subSequence(start, end));
   }

   public PrintStream append(char c) {
      this.print(c);
      return this;
   }
}
