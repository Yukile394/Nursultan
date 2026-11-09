package minecraft;

import java.io.DataOutput;
import java.io.IOException;

public record class07019(double value) implements class07737 {
   private static final int t = 16;
   public static final class07019 N = new class07019(0.0);
   public static final class01424<class07019> y = new class07014();

   @Override
   public byte L() {
      return 6;
   }

   @Override
   public long M() {
      return (long)Math.floor(this.value);
   }

   @Deprecated(
      forRemoval = true
   )
   public class07019(double value) {
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
      return class04995.N(this.value);
   }

   @Override
   public short Z() {
      return (short)(class04995.N(this.value) & 65535);
   }

   public class07019 N() {
      return this;
   }

   public double m() {
      return this.value;
   }

   @Override
   public double U() {
      return this.value;
   }

   @Override
   public byte z() {
      return (byte)(class04995.N(this.value) & 0xFF);
   }

   @Override
   public class01424<class07019> u() {
      return y;
   }

   @Override
   public int y() {
      return 16;
   }

   @Override
   public float E() {
      return (float)this.value;
   }

   @Override
   public void N(class04836 var1) {
      var1.N(this);
   }

   @Override
   public void N(DataOutput var1) throws IOException {
      var1.writeDouble(this.value);
   }

   public static class07019 N(double var0) {
      return var0 == 0.0 ? N : new class07019(var0);
   }

   @Override
   public class03154 N(class03175 var1) {
      return var1.N(this.value);
   }

   @Override
   public Number W() {
      return this.value;
   }
}
