package minecraft;

import com.mojang.datafixers.util.Either;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class03552<T> extends class03550<T> {
   private final class02042<T> y;
   private final class03530<T> L;
   @Nullable
   public List<class03556<T>> N;

   @Override
   public boolean L() {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.y(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueZ() : this.N != null;
   }

   @Override
   protected List<class03556<T>> M() {
      this.N(null);
      if (this.N == null) {
         throw new IllegalStateException("Trying to access unbound tag '" + this.L + "' from registry " + this.y);
      } else {
         return this.N;
      }
   }

   public class03552(class02042<T> var1, class03530<T> var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   @Override
   public String toString() {
      return "NamedSet(" + this.L + ")[" + this.N + "]";
   }

   public class03530<T> B() {
      return this.L;
   }

   @Override
   public Optional<class03530<T>> i() {
      return Optional.of(this.L);
   }

   @Override
   public Either<class03530<T>, List<class03556<T>>> u() {
      return Either.left(this.L);
   }

   private void y(CallbackInfoReturnable var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21)) {
         var1.setReturnValue(true);
      }
   }

   public void y(List<class03556<T>> var1) {
      this.N = List.copyOf(var1);
   }

   @Override
   public boolean N(class03556<T> var1) {
      return var1.N(this.L);
   }

   private void N(CallbackInfoReturnable var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21) && this.N == null) {
         this.y(List.of());
      }
   }

   @Override
   public boolean N(class02042<T> var1) {
      return this.y.N(var1);
   }
}
