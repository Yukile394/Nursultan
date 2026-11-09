package minecraft;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class class05164 {
   private final ByteArrayOutputStream N;
   private final DataOutputStream y;

   public class05164(int var1) {
      super();
      this.N = new ByteArrayOutputStream(var1);
      this.y = new DataOutputStream(this.N);
   }

   public void y(int var1) throws IOException {
      this.y.writeInt(Integer.reverseBytes(var1));
   }

   public void y() {
      this.N.reset();
   }

   public void N(short var1) throws IOException {
      this.y.writeShort(Short.reverseBytes(var1));
   }

   public byte[] N() {
      return this.N.toByteArray();
   }

   public void N(float var1) throws IOException {
      this.y.writeInt(Integer.reverseBytes(Float.floatToIntBits(var1)));
   }

   public void N(byte[] var1) throws IOException {
      this.y.write(var1, 0, var1.length);
   }

   public void N(String var1) throws IOException {
      this.y.write(var1.getBytes(StandardCharsets.UTF_8));
      this.y.write(0);
   }

   public void N(int var1) throws IOException {
      this.y.write(var1);
   }
}
