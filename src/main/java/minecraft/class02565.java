package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class02565 implements class00381<class07280> {
   public static final class02362<class04247, class02565> N = class00381.N(class02565::N, class02565::new);
   private static final int y = 0;
   private static final int L = 1;
   private static final int u = 2;
   private static final int i = 3;
   private static final int R = 4;
   private static final int M = 40;
   private static final int B = 40;
   private final int Z;
   private final String z;
   private final Collection<String> U;
   private final Optional<class02406> E;

   public String L() {
      return this.z;
   }

   public Optional<class02406> M() {
      return this.E;
   }

   private class02565(class04247 var1) {
      super();
      this.z = var1.s();
      this.Z = var1.readByte();
      if (y(this.Z)) {
         this.E = Optional.of(new class02406(var1));
      } else {
         this.E = Optional.empty();
      }

      if (N(this.Z)) {
         this.U = var1.N_16(class00667::s);
      } else {
         this.U = ImmutableList.of();
      }
   }

   private class02565(String var1, int var2, Optional<class02406> var3, Collection<String> var4) {
      super();
      this.z = var1;
      this.Z = var2;
      this.E = var3;
      this.U = ImmutableList.copyOf(var4);
   }

   public Collection<String> u() {
      return this.U;
   }

   @Nullable
   public class02724 y() {
      return switch (this.Z) {
         case 0 -> class02724.field_29155;
         case 1 -> class02724.field_29156;
         default -> null;
      };
   }

   private static boolean y(int var0) {
      return var0 == 0 || var0 == 2;
   }

   public static class02565 N(class00502 var0) {
      return new class02565(var0.L(), 1, Optional.empty(), ImmutableList.of());
   }

   private void N(class04247 var1) {
      var1.N(this.z);
      var1.writeByte(this.Z);
      if (y(this.Z)) {
         this.E.orElseThrow(() -> new IllegalStateException("Parameters not present, but method is" + this.Z)).N(var1);
      }

      if (N(this.Z)) {
         var1.N_12(this.U, class00667::N);
      }
   }

   public static class02565 N(class00502 var0, boolean var1) {
      return new class02565(var0.L(), var1 ? 0 : 2, Optional.of(new class02406(var0)), (Collection<String>)(var1 ? var0.B() : ImmutableList.of()));
   }

   @Nullable
   public class02724 N() {
      return switch (this.Z) {
         case 0, 3 -> class02724.field_29155;
         default -> null;
         case 4 -> class02724.field_29156;
      };
   }

   private static boolean N(int var0) {
      return var0 == 0 || var0 == 3 || var0 == 4;
   }

   public static class02565 N(class00502 var0, String var1, class02724 var2) {
      return new class02565(var0.L(), var2 == class02724.field_29155 ? 3 : 4, Optional.empty(), ImmutableList.of(var1));
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   @Override
   public class02897<class02565> method_65080() {
      return class04248.Nf;
   }
}
