package minecraft;

import java.io.DataOutput;
import java.io.IOException;

public record class07009(float value) implements class07737 {
   private static final int t = 12;
   public static final class07009 N = new class07009(0.0F);
   public static final class01424<class07009> y = new class07038();

   @Override
   public byte L() {
      return 5;
   }

   @Override
   public long M() {
      return (long)this.value;
   }

   @Deprecated(
      forRemoval = true
   )
   public class07009(float value) {
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
      return class04995.y(this.value);
   }

   @Override
   public short Z() {
      return (short)(class04995.y(this.value) & 65535);
   }

   public class07009 N() {
      return this;
   }

   public float m() {
      return this.value;
   }

   @Override
   public double U() {
      return this.value;
   }

   @Override
   public byte z() {
      return (byte)(class04995.y(this.value) & 0xFF);
   }

   @Override
   public class01424<class07009> u() {
      return y;
   }

   @Override
   public int y() {
      return 12;
   }

   @Override
   public float E() {
      return this.value;
   }

   @Override
   public void N(class04836 var1) {
      var1.N(this);
   }

   @Override
   public void N(DataOutput var1) throws IOException {
      var1.writeFloat(this.value);
   }

   public static class07009 N(float var0) {
      return var0 == 0.0F ? N : new class07009(var0);
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
