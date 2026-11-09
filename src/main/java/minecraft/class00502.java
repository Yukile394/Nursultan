package minecraft;

import com.google.common.collect.Sets;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00502 extends class06639 {
   private static final int N = 0;
   private static final int y = 1;
   private final class06683 L;
   private final String u;
   private final Set<String> i = Sets.newHashSet();
   private class00392 R;
   private class00392 M = class05220.N;
   private class00392 B = class05220.N;
   private boolean Z = true;
   private boolean z = true;
   private class06672 U = class06672.field_1442;
   private class06672 E = class06672.field_1442;
   private class06541 W = class06541.field_1070;
   private class06656 m = class06656.field_1437;
   private final class00405 P;

   public void L(@Nullable class00392 var1) {
      this.B = var1 == null ? class05220.N : var1;
      this.L.L(this);
   }

   @Override
   public String L() {
      return this.u;
   }

   public class00392 M() {
      return this.B;
   }

   @Override
   public class06541 P() {
      return this.W;
   }

   public class00502(class06683 var1, String var2) {
      super();
      this.L = var1;
      this.u = var2;
      this.R = class00392.y(var2);
      this.P = class00405.N.N(var2).N(new class00401(class00392.y(var2)));
   }

   @Override
   public Collection<String> B() {
      return this.i;
   }

   @Override
   public boolean Z() {
      return this.Z;
   }

   private class00405 i(class00392 var1) {
      for (int ix = var1.method_10855().size() - 1; ix >= 0; ix--) {
         class00392 class00392 = var1.method_10855().get(ix);
         if (class00392.method_10866() != class00405.N) {
            return class00392.method_10866();
         }
      }

      return var1.method_10866();
   }

   public class05216 i() {
      class05216 class05216 = class00390.N((class00392)this.R.L().L(this.P));
      class06541 class06541 = this.P();
      if (class06541 != class06541.field_1070) {
         class05216.N(class06541);
      }

      return class05216;
   }

   public int m() {
      byte b0 = 0;
      if (this.Z()) {
         b0 |= 1;
      }

      if (this.z()) {
         b0 |= 2;
      }

      return b0;
   }

   @Override
   public class06672 U() {
      return this.U;
   }

   @Override
   public boolean z() {
      return this.z;
   }

   @Override
   public class05216 u(class00392 var1) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class05216)callbackinforeturnable.getReturnValue();
      } else {
         class05216 class05216 = class00392.i().y(this.M).y(var1).y(this.B);
         class06541 class06541 = this.P();
         if (class06541 != class06541.field_1070) {
            class05216.N(class06541);
         }

         return class05216;
      }
   }

   public class00392 u() {
      return this.R;
   }

   public void y(boolean var1) {
      this.z = var1;
      this.L.L(this);
   }

   public void y(class06672 var1) {
      this.E = var1;
      this.L.L(this);
   }

   public class06683 y() {
      return this.L;
   }

   public void y(@Nullable class00392 var1) {
      this.M = var1 == null ? class05220.N : var1;
      this.L.L(this);
   }

   @Override
   public class06672 E() {
      return this.E;
   }

   public void N(class06656 var1) {
      this.m = var1;
      this.L.L(this);
   }

   private class00392 N(class00392 var1, class00405 var2) {
      return (class00392)(var1.method_10866() != class00405.N ? var1 : var1.L().L(var2));
   }

   public void N(int var1) {
      this.N((var1 & 1) > 0);
      this.y((var1 & 2) > 0);
   }

   private void N(class00392 var1, CallbackInfoReturnable var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
         class00405 class00405x = this.i(this.M);
         class00392 class00392 = this.N(var1, class00405x);
         class00405 class00405x = this.i(class00392);
         var2.setReturnValue(class00392.i().y(this.M).y(class00392).y(this.N(this.B, class00405x)));
      }
   }

   public void N(class06541 var1) {
      this.W = var1;
      this.L.L(this);
   }

   public void N(class00392 var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.R = var1;
         this.L.L(this);
      }
   }

   public class00497 N() {
      return new class00497(
         this.u,
         Optional.of(this.R),
         this.W != class06541.field_1070 ? Optional.of(this.W) : Optional.empty(),
         this.Z,
         this.z,
         this.M,
         this.B,
         this.U,
         this.E,
         this.m,
         List.copyOf(this.i)
      );
   }

   public void N(boolean var1) {
      this.Z = var1;
      this.L.L(this);
   }

   public static class05216 N(@Nullable class06639 var0, class00392 var1) {
      return var0 == null ? var1.L() : var0.u(var1);
   }

   public void N(class06672 var1) {
      this.U = var1;
      this.L.L(this);
   }

   @Override
   public class06656 W() {
      return this.m;
   }

   public class00392 R() {
      return this.M;
   }
}
