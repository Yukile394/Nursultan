package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import java.util.stream.Stream;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.impl.datagen.client.FabricItemAssetDefinitions;

@Environment(EnvType.CLIENT)
public class class05409 implements class08833, FabricItemAssetDefinitions {
   private final Map<class06581, class08839> N = new HashMap<>();
   private final Map<class06581, class06581> y = new HashMap<>();
   private FabricDataOutput L;
   private Set u;

   public class05409() {
      super();
   }

   private boolean N(Map var1, Object var2, Operation var3) {
      class06918 class06918 = (class06918)var2;
      if (this.L != null) {
         if (!this.u.contains(class06918.L())) {
            return true;
         }

         if (!class04206.B.y(class06918).y().equals(this.L.getModId())) {
            return true;
         }
      }

      return (Boolean)var3.call(new Object[]{var1, var2});
   }

   private Predicate N(Predicate var1) {
      return this.L != null ? var1.and(var1x -> this.L.isStrictValidationEnabled()).and(var1x -> var1x.B().N().y().equals(this.L.getModId())) : var1;
   }

   private void N(class06581 var1, class08839 var2) {
      if (this.N.put(var1, var2) != null) {
         throw new IllegalStateException("Duplicate item model definition for " + var1);
      }
   }

   @Override
   public void N(class06581 var1, class08895 var2, class08906 var3) {
      this.N(var1, new class08839(var2, var3));
   }

   public CompletableFuture<?> N(class04476 var1, class01997 var2) {
      return class07135.N(var1, class08839.N, var1x -> var2.N(var1x.i().B().N()), this.N);
   }

   @Override
   public void N(class06581 var1, class06581 var2) {
      this.y.put(var2, var1);
   }

   public void N() {
      class04206.B.forEach(var1x -> {
         if (!this.y.containsKey(var1x)) {
            if (var1x instanceof class06918 class06918) {
               Map<class06581, class08839> map = this.N;
               if (!this.N(map, class06918, var0 -> {
                  WrapOperationRuntime.checkArgumentCount(var0, 2, "[java.util.Map, java.lang.Object]");
                  return ((Map)var0[0]).containsKey(var0[1]);
               })) {
                  class01894 class01894 = class05387.N(class06918.L());
                  this.N(class06918, class08825.N(class01894));
               }
            }
         }
      });
      this.y.forEach((var1x, var2x) -> {
         class08839 class08839 = this.N.get(var2x);
         if (class08839 == null) {
            throw new IllegalStateException("Missing donor: " + var2x + " -> " + var1x);
         } else {
            this.N(var1x, class08839);
         }
      });
      Stream stream = class04206.B.z();
      Predicate predicate = var1x -> !this.N.containsKey(var1x.N());
      List list = stream.filter(this.N(predicate)).map(var0 -> var0.B().N()).toList();
      if (!list.isEmpty()) {
         throw new IllegalStateException("Missing item model definitions for: " + list);
      }
   }

   public void fabric_setProcessedBlocks(Set var1) {
      this.u = var1;
   }

   public void setFabricDataOutput(FabricDataOutput var1) {
      this.L = var1;
   }
}
