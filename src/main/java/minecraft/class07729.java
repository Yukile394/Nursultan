package minecraft;

import java.io.DataOutput;
import java.io.IOException;

public record class07729(long value) implements class07737 {
   private static final int L = 16;
   public static final class01424<class07729> N = new class07745();

   @Override
   public byte L() {
      return 4;
   }

   @Override
   public long M() {
      return this.value;
   }

   @Deprecated(
      forRemoval = true
   )
   public class07729(long value) {
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
      return (int)(this.value & -1L);
   }

   @Override
   public short Z() {
      return (short)(this.value & 65535L);
   }

   public class07729 N() {
      return this;
   }

   public long m() {
      return this.value;
   }

   @Override
   public double U() {
      return this.value;
   }

   @Override
   public byte z() {
      return (byte)(this.value & 255L);
   }

   @Override
   public class01424<class07729> u() {
      return N;
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
      var1.writeLong(this.value);
   }

   public static class07729 N(long var0) {
      return var0 >= -128L && var0 <= 1024L ? class07722.N[(int)var0 - -128] : new class07729(var0);
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
