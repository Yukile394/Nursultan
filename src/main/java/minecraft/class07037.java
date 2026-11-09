package minecraft;

import java.io.DataOutput;
import java.io.IOException;

public record class07037(byte value) implements class07737 {
   private static final int G = 9;
   public static final class01424<class07037> N = new class07026();
   public static final class07037 y = N((byte)0);
   public static final class07037 L = N((byte)1);

   @Override
   public byte L() {
      return 1;
   }

   @Override
   public long M() {
      return this.value;
   }

   @Deprecated(
      forRemoval = true
   )
   public class07037(byte value) {
      super();
      this.value = value;
   }

   @Override
   public String toString() {
      class04818 class04818 = new class04818();
      class04818.N(this);
      return class04818.N();
   }

   @Override
   public int B() {
      return this.value;
   }

   @Override
   public short Z() {
      return this.value;
   }

   public class07037 N() {
      return this;
   }

   public byte m() {
      return this.value;
   }

   @Override
   public double U() {
      return this.value;
   }

   @Override
   public byte z() {
      return this.value;
   }

   @Override
   public class01424<class07037> u() {
      return N;
   }

   @Override
   public int y() {
      return 9;
   }

   @Override
   public float E() {
      return this.value;
   }

   public static class07037 N(boolean var0) {
      return var0 ? L : y;
   }

   @Override
   public void N(DataOutput var1) throws IOException {
      var1.writeByte(this.value);
   }

   public static class07037 N(byte var0) {
      return class07015.N[128 + var0];
   }

   @Override
   public class03154 N(class03175 var1) {
      return var1.N(this.value);
   }

   @Override
   public void N(class04836 var1) {
      var1.N(this);
   }

   @Override
   public Number W() {
      return this.value;
   }
}
