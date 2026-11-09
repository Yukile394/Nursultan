package minecraft;

import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.recipe.v1.FabricRecipeManager;
import net.fabricmc.fabric.api.recipe.v1.sync.SynchronizedRecipes;
import net.fabricmc.fabric.impl.recipe.sync.SynchronizedRecipesImpl;
import net.fabricmc.fabric.impl.recipe.sync.client.SynchronizedClientRecipesSetter;

@Environment(EnvType.CLIENT)
public class class00290 implements class00272, FabricRecipeManager, SynchronizedClientRecipesSetter {
   private final Map<class05946<class00263>, class00263> N;
   private final class00279<class06156> y;
   private SynchronizedRecipes L = SynchronizedRecipesImpl.EMPTY;

   public class00290(Map<class05946<class00263>, class00263> var1, class00279<class06156> var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public class00279<class06156> N() {
      return this.y;
   }

   @Override
   public class00263 N(class05946<class00263> var1) {
      return this.N.getOrDefault(var1, class00263.z);
   }

   public SynchronizedRecipes getSynchronizedRecipes() {
      return this.L;
   }

   public void fabric_setSynchronizedClientRecipes(SynchronizedRecipes var1) {
      this.L = var1;
   }
}
