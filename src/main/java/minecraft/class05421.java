package minecraft;

import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.impl.datagen.client.FabricModelProviderDefinitions;

@Environment(EnvType.CLIENT)
public class class05421 implements Consumer<class05399>, FabricModelProviderDefinitions {
   public final Map<class00891, class05399> N = new HashMap<>();
   private FabricDataOutput y;

   public class05421() {
      super();
   }

   public void accept(class05399 var1) {
      class00891 class00891 = var1.N();
      if (this.N.put(class00891, var1) != null) {
         throw new IllegalStateException("Duplicate blockstate definition for " + class00891);
      }
   }

   private Predicate N(Predicate var1) {
      return this.y != null ? var1.and(var1x -> this.y.isStrictValidationEnabled()).and(var1x -> var1x.B().N().y().equals(this.y.getModId())) : var1;
   }

   public CompletableFuture<?> N(class04476 var1, class01997 var2) {
      Map map = Maps.transformValues(this.N, class05399::y);
      Function function = var1x -> var2.N(var1x.s().B().N());
      return class07135.N(var1, class04127.y, function, map);
   }

   public void N() {
      Stream stream = class04206.i.z();
      Predicate predicate = var0 -> true;
      List list = stream.filter(this.N(predicate)).filter(var1 -> !this.N.containsKey(var1.N())).map(var0 -> var0.B().N()).toList();
      if (!list.isEmpty()) {
         throw new IllegalStateException("Missing blockstate definitions for: " + list);
      }
   }

   public void setFabricDataOutput(FabricDataOutput var1) {
      this.y = var1;
   }
}
