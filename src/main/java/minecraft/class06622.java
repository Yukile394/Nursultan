package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public class class06622 extends class06600 {
   protected static final class02131<class02689> N = class03289.N(class06622.class, class02154.e);
   private static final class02131<Boolean> i = class03289.N(class06622.class, class02154.U);
   private static final class02131<Optional<class00392>> R = class03289.N(class06622.class, class02154.M);
   private static final byte M = (byte)Arrays.stream(class08030.values()).mapToInt(class08030::N).reduce(0, (var0, var1) -> var0 | var1);
   private static final Set<class01312> B = Set.of(
      class01312.field_18076, class01312.field_18081, class01312.field_18079, class01312.field_18077, class01312.field_18078
   );
   public static final Codec<class01312> y = class01312.field_63012
      .validate(var0 -> B.contains(var0) ? DataResult.success(var0) : DataResult.error(() -> "Invalid pose: " + var0.method_15434()));
   private static final Codec<Byte> Z = class08030.field_62532
      .listOf()
      .xmap(
         var0 -> (byte)var0.stream().mapToInt(class08030::N).reduce(M, (var0x, var1) -> var0x & ~var1),
         var0 -> Arrays.stream(class08030.values()).filter(var1 -> (var0 & var1.N()) == 0).toList()
      );
   public static final class02689 L = class02697.i;
   private static final class00392 W = class00392.L("entity.minecraft.mannequin.label");
   public static class07040<class06622> u = class06622::new;
   private static final String m = "profile";
   private static final String P = "hidden_layers";
   private static final String s = "main_hand";
   private static final String T = "pose";
   private static final String b = "immovable";
   private static final String j = "description";
   private static final String v = "hide_description";
   private class00392 n = W;
   private boolean t = false;

   private boolean L() {
      return this.field_6011.N(i);
   }

   @Override
   public boolean method_6034() {
      return !this.L() && super.method_6034();
   }

   @Override
   protected void method_66649(class02666 var1) {
      this.method_66650(var1, class02484.Nb);
      super.method_66649(var1);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(N, L);
      var1.N(i, false);
      var1.N(R, Optional.of(W));
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("profile", class02689.N, this.N());
      var1.N("hidden_layers", Z, this.field_6011.N(field_62514));
      var1.N("main_hand", class07070.field_45121, this.method_6068());
      var1.N("pose", y, this.method_18376());
      var1.N("immovable", this.L());
      class00392 class00392 = this.y();
      if (class00392 != null) {
         if (!class00392.equals(W)) {
            var1.N("description", class03748.N, class00392);
         }
      } else {
         var1.N("hide_description", true);
      }
   }

   @Nullable
   @Override
   public <T> T method_58694(class02477<? extends T> var1) {
      return var1 == class02484.Nb ? method_66651(var1, this.N()) : super.method_58694(var1);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      var1.<class02689>N("profile", class02689.N).ifPresent(this::N);
      this.field_6011.N(field_62514, var1.<Byte>N("hidden_layers", Z).orElse(M));
      this.method_74090(var1.<class07070>N("main_hand", class07070.field_45121).orElse(field_62509));
      this.method_18380(var1.<class01312>N("pose", y).orElse(class01312.field_18076));
      this.N(var1.N("immovable", false));
      this.y(var1.N("hide_description", false));
      this.N(var1.<class00392>N("description", class03748.N).orElse(W));
   }

   public class06622(class07078<class06622> var1, class07299 var2) {
      super(var1, var2);
      this.field_6011.N(field_62514, M);
   }

   public class06622(class07299 var1) {
      this(class07078.No, var1);
   }

   private void u() {
      this.field_6011.N(R, this.t ? Optional.empty() : Optional.of(this.n));
   }

   @Nullable
   protected class00392 y() {
      return this.field_6011.N(R).orElse(null);
   }

   private void y(boolean var1) {
      this.t = var1;
      this.u();
   }

   private void N(class02689 var1) {
      this.field_6011.N(N, var1);
   }

   protected class02689 N() {
      return this.field_6011.N(N);
   }

   @Nullable
   public static class06622 N(class07078<class06622> var0, class07299 var1) {
      return u.create(var0, var1);
   }

   private void N(boolean var1) {
      this.field_6011.N(i, var1);
   }

   private void N(class00392 var1) {
      this.n = var1;
      this.u();
   }

   @Override
   protected <T> boolean method_66654(class02477<T> var1, T var2) {
      if (var1 == class02484.Nb) {
         this.N(method_66651(class02484.Nb, var2));
         return true;
      } else {
         return super.method_66654(var1, var2);
      }
   }

   @Override
   public boolean method_6062() {
      return this.L() || super.method_6062();
   }
}
