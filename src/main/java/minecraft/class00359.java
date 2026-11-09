package minecraft;

public record class00359(class01140 entityModelSet, class08097 materials, class07949 playerSkinRenderCache) implements class00331 {
   @Override
   public class08097 L() {
      return this.materials;
   }

   public class00359(class01140 entityModelSet, class08097 materials, class07949 playerSkinRenderCache) {
      super();
      this.entityModelSet = entityModelSet;
      this.materials = materials;
      this.playerSkinRenderCache = playerSkinRenderCache;
   }

   @Override
   public class07949 u() {
      return this.playerSkinRenderCache;
   }

   @Override
   public class01140 y() {
      return this.entityModelSet;
   }
}
