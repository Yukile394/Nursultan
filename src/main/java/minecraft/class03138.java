package minecraft;

import java.io.DataOutput;
import java.io.IOException;

public class class03138 implements DataOutput {
   private final DataOutput N;

   public class03138(DataOutput var1) {
      super();
      this.N = var1;
   }

   @Override
   public void write(byte[] var1, int var2, int var3) throws IOException {
      this.N.write(var1, var2, var3);
   }

   @Override
   public void write(byte[] var1) throws IOException {
      this.N.write(var1);
   }

   @Override
   public void write(int var1) throws IOException {
      this.N.write(var1);
   }

   @Override
   public void writeInt(int var1) throws IOException {
      this.N.writeInt(var1);
   }

   @Override
   public void writeUTF(String var1) throws IOException {
      this.N.writeUTF(var1);
   }

   @Override
   public void writeBytes(String var1) throws IOException {
      this.N.writeBytes(var1);
   }

   @Override
   public void writeChar(int var1) throws IOException {
      this.N.writeChar(var1);
   }

   @Override
   public void writeFloat(float var1) throws IOException {
      this.N.writeFloat(var1);
   }

   @Override
   public void writeShort(int var1) throws IOException {
      this.N.writeShort(var1);
   }

   @Override
   public void writeBoolean(boolean var1) throws IOException {
      this.N.writeBoolean(var1);
   }

   @Override
   public void writeByte(int var1) throws IOException {
      this.N.writeByte(var1);
   }

   @Override
   public void writeLong(long var1) throws IOException {
      this.N.writeLong(var1);
   }

   @Override
   public void writeDouble(double var1) throws IOException {
      this.N.writeDouble(var1);
   }

   @Override
   public void writeChars(String var1) throws IOException {
      this.N.writeChars(var1);
   }
}
