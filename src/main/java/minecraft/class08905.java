package minecraft;

import org.jspecify.annotations.Nullable;

public record class08905(
   class02028 blockModelBaker,
   class01140 entityModelSet,
   class08097 materials,
   class07949 playerSkinRenderCache,
   class08910 missingItemModel,
   class00203 contextSwapper
) implements class00331 {
   @Override
   public class08097 L() {
      return this.materials;
   }

   public class08905(
      class02028 blockModelBaker,
      class01140 entityModelSet,
      class08097 materials,
      class07949 playerSkinRenderCache,
      class08910 missingItemModel,
      @Nullable class00203 contextSwapper
   ) {
      this.blockModelBaker = blockModelBaker;
      this.entityModelSet = entityModelSet;
      this.materials = materials;
      this.playerSkinRenderCache = playerSkinRenderCache;
      this.missingItemModel = missingItemModel;
      this.contextSwapper = contextSwapper;
   }

   public class08910 i() {
      return this.missingItemModel;
   }

   @Override
   public class07949 u() {
      return this.playerSkinRenderCache;
   }

   @Override
   public class01140 y() {
      return this.entityModelSet;
   }

   public class02028 N() {
      return this.blockModelBaker;
   }

   @Nullable
   public class00203 R() {
      return this.contextSwapper;
   }
}
