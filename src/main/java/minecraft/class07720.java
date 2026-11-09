package minecraft;

import java.io.DataOutput;
import java.io.IOException;

public record class07720(int value) implements class07737 {
   private static final int L = 12;
   public static final class01424<class07720> N = new class07756();

   @Override
   public byte L() {
      return 3;
   }

   @Override
   public long M() {
      return this.value;
   }

   @Deprecated(
      forRemoval = true
   )
   public class07720(int value) {
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
      return (short)(this.value & 65535);
   }

   public class07720 N() {
      return this;
   }

   public int m() {
      return this.value;
   }

   @Override
   public double U() {
      return this.value;
   }

   @Override
   public byte z() {
      return (byte)(this.value & 0xFF);
   }

   @Override
   public class01424<class07720> u() {
      return N;
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
      var1.writeInt(this.value);
   }

   public static class07720 N(int var0) {
      return var0 >= -128 && var0 <= 1024 ? class07718.N[var0 - -128] : new class07720(var0);
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
