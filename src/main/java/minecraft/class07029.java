package minecraft;

import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;
import org.apache.commons.lang3.ArrayUtils;

public final class class07029 implements class07023 {
   private static final int y = 24;
   public static final class01424<class07029> N = new class07035();
   private byte[] L;

   @Override
   public byte L() {
      return 7;
   }

   public class07029(byte[] var1) {
      super();
      this.L = var1;
   }

   @Override
   public int size() {
      return this.L.length;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof class07029 && Arrays.equals(this.L, ((class07029)var1).L);
   }

   @Override
   public String toString() {
      class04818 class04818 = new class04818();
      class04818.N(this);
      return class04818.N();
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode(this.L);
   }

   @Override
   public void clear() {
      this.L = new byte[0];
   }

   public byte[] i() {
      return this.L;
   }

   @Override
   public class01424<class07029> u() {
      return N;
   }

   @Override
   public boolean y(int var1, class07709 var2) {
      if (var2 instanceof class07737 class07737) {
         this.L = ArrayUtils.add(this.L, var1, class07737.z());
         return true;
      } else {
         return false;
      }
   }

   @Override
   public int y() {
      return 24 + 1 * this.L.length;
   }

   public class07037 u(int var1) {
      byte b0 = this.L[var1];
      this.L = ArrayUtils.remove(this.L, var1);
      return class07037.N(b0);
   }

   @Override
   public class03154 N(class03175 var1) {
      return var1.N(this.L);
   }

   @Override
   public void N(DataOutput var1) throws IOException {
      var1.writeInt(this.L.length);
      var1.write(this.L);
   }

   @Override
   public class07709 N() {
      byte[] abyte = new byte[this.L.length];
      System.arraycopy(this.L, 0, abyte, 0, this.L.length);
      return new class07029(abyte);
   }

   public class07037 L(int var1) {
      return class07037.N(this.L[var1]);
   }

   @Override
   public void N(class04836 var1) {
      var1.N(this);
   }

   @Override
   public boolean N(int var1, class07709 var2) {
      if (var2 instanceof class07737 class07737) {
         this.L[var1] = class07737.z();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public Optional<byte[]> R() {
      return Optional.of(this.L);
   }
}
