package minecraft;

import com.google.common.collect.Lists;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
public class class03461 implements class07689, FabricClientCommandSource {
   private final class01683 N;
   private final class06202 y;
   private int u = -1;
   @Nullable
   private CompletableFuture<Suggestions> i;
   private final Set<String> R = new HashSet<>();
   private final class08152 M;

   @Override
   public Collection<class07665> Q() {
      class07089 class07089 = (class07089)this.y.M_3;
      if (class07089 != null && class07089.N() == class07113.field_1332) {
         class06889 class06889 = class07089.y();
         return Collections.singleton(new class07665(N(class06889.M), N(class06889.B), N(class06889.Z)));
      } else {
         return class07689.super.Q();
      }
   }

   public class03461(class01683 var1, class06202 var2, class08152 var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.M = var3;
   }

   @Override
   public Collection<String> b() {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (Collection<String>)callbackinforeturnable.getReturnValue();
      } else {
         ArrayList arraylist = Lists.newArrayList();

         for (class03458 class03458 : this.N.Z()) {
            arraylist.add(class03458.N().name());
         }

         return arraylist;
      }
   }

   @Override
   public Set<class05946<class07299>> n() {
      return this.N.b();
   }

   @Override
   public class01042 t() {
      return this.N.j();
   }

   @Override
   public Stream<class01894> v() {
      return this.y.Nr().L().stream();
   }

   @Override
   public Collection<String> j() {
      return this.N.l().u();
   }

   public void N(class03043 var1, List<String> var2) {
      switch (var1) {
         case field_39801:
            this.R.addAll(var2);
            break;
         case field_39802:
            var2.forEach(this.R::remove);
            break;
         case field_39803:
            this.R.clear();
            this.R.addAll(var2);
      }
   }

   private void N(CallbackInfoReturnable var1) {
      if (ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)) {
         var1.setReturnValue(this.R);
      }
   }

   public void N(int var1, Suggestions var2) {
      if (var1 == this.u) {
         this.i.complete(var2);
         this.i = null;
         this.u = -1;
      }
   }

   @Override
   public CompletableFuture<Suggestions> N(CommandContext<?> var1) {
      if (this.i != null) {
         this.i.cancel(false);
      }

      this.i = new CompletableFuture<>();
      int ix = ++this.u;
      this.N.N(new class00526(ix, var1.getInput()));
      return this.i;
   }

   private static String N(double var0) {
      return String.format(Locale.ROOT, "%.2f", var0);
   }

   private static String N(int var0) {
      return Integer.toString(var0);
   }

   @Override
   public CompletableFuture<Suggestions> N(class05946<? extends class00751<?>> var1, class07666 var2, SuggestionsBuilder var3, CommandContext<?> var4) {
      return this.t().method_46759(var1).map(var3x -> {
         this.N(var3x, var2, var3);
         return var3.buildFuture();
      }).orElseGet(() -> this.N(var4));
   }

   @Override
   public class08152 N() {
      return this.M;
   }

   @Override
   public class03767 G() {
      return this.N.G();
   }

   @Override
   public Collection<class07665> Y() {
      class07089 class07089 = (class07089)this.y.M_3;
      if (class07089 != null && class07089.N() == class07113.field_1332) {
         class07209 class07209 = ((class06183)class07089).u();
         return Collections.singleton(new class07665(N(class07209.method_10263()), N(class07209.method_10264()), N(class07209.method_10260())));
      } else {
         return class07689.super.Y();
      }
   }

   @Override
   public Collection<String> ag_() {
      return (Collection<String>)((class07089)this.y.M_3 != null && ((class07089)this.y.M_3).N() == class07113.field_1331
         ? Collections.singleton(((class06145)((class07089)this.y.M_3)).L().method_5845())
         : Collections.emptyList());
   }

   @Override
   public Collection<String> af_() {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (Collection<String>)callbackinforeturnable.getReturnValue();
      } else if (this.R.isEmpty()) {
         return this.b();
      } else {
         HashSet hashset = new HashSet<>(this.b());
         hashset.addAll(this.R);
         return hashset;
      }
   }

   public void sendError(class00392 var1) {
      this.sendFeedback(class00392.i().y(var1).N(class06541.field_1061));
   }

   public class03448 getWorld() {
      return (class03448)this.y.T_3;
   }

   public void sendFeedback(class00392 var1) {
      ((class01056)this.y.i_6).i().N(var1);
      this.y.NT().y(var1);
   }

   public class06202 getClient() {
      return this.y;
   }

   public class04453 getPlayer() {
      return (class04453)this.y.T_4;
   }
}
