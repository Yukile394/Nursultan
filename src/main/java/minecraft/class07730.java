package minecraft;

import java.io.DataOutput;
import java.io.IOException;

public record class07730(short value) implements class07737 {
   private static final int L = 10;
   public static final class01424<class07730> N = new class07733();

   @Override
   public byte L() {
      return 2;
   }

   @Override
   public long M() {
      return this.value;
   }

   @Deprecated(
      forRemoval = true
   )
   public class07730(short value) {
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

   public class07730 N() {
      return this;
   }

   public short m() {
      return this.value;
   }

   @Override
   public double U() {
      return this.value;
   }

   @Override
   public byte z() {
      return (byte)(this.value & 255);
   }

   @Override
   public class01424<class07730> u() {
      return N;
   }

   @Override
   public int y() {
      return 10;
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
      var1.writeShort(this.value);
   }

   public static class07730 N(short var0) {
      return var0 >= -128 && var0 <= 1024 ? class07747.N[var0 - -128] : new class07730(var0);
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
