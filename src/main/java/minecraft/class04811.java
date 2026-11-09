package minecraft;

public record class04811(
   class03579 blockEntityRenderDispatcher,
   class01999 blockRenderDispatcher,
   class08943 itemModelResolver,
   class02862 itemRenderer,
   class01781 entityRenderer,
   class01140 entityModelSet,
   class01590 font,
   class08097 materials,
   class07949 playerSkinRenderCache
) {
   public class08943 L() {
      return this.itemModelResolver;
   }

   public class01590 M() {
      return this.font;
   }

   public class04811(
      class03579 blockEntityRenderDispatcher,
      class01999 blockRenderDispatcher,
      class08943 itemModelResolver,
      class02862 itemRenderer,
      class01781 entityRenderer,
      class01140 entityModelSet,
      class01590 font,
      class08097 materials,
      class07949 playerSkinRenderCache
   ) {
      this.blockEntityRenderDispatcher = blockEntityRenderDispatcher;
      this.blockRenderDispatcher = blockRenderDispatcher;
      this.itemModelResolver = itemModelResolver;
      this.itemRenderer = itemRenderer;
      this.entityRenderer = entityRenderer;
      this.entityModelSet = entityModelSet;
      this.font = font;
      this.materials = materials;
      this.playerSkinRenderCache = playerSkinRenderCache;
   }

   public class08097 B() {
      return this.materials;
   }

   public class07949 Z() {
      return this.playerSkinRenderCache;
   }

   public class01781 i() {
      return this.entityRenderer;
   }

   public class02862 u() {
      return this.itemRenderer;
   }

   public class01999 y() {
      return this.blockRenderDispatcher;
   }

   public class03579 N() {
      return this.blockEntityRenderDispatcher;
   }

   public class01686 N(class01134 var1) {
      return this.entityModelSet.N(var1);
   }

   public class01140 R() {
      return this.entityModelSet;
   }
}
