package minecraft;

public record class03313<C extends class06386>(
   C config, class08088 chunkGenerator, class01224 structureTemplateManager, class07321 chunkPos, class05474 heightAccessor, class07836 random, long seed
) {
   public class01224 L() {
      return this.structureTemplateManager;
   }

   public long M() {
      return this.seed;
   }

   public class03313(
      C config, class08088 chunkGenerator, class01224 structureTemplateManager, class07321 chunkPos, class05474 heightAccessor, class07836 random, long seed
   ) {
      this.config = (C)config;
      this.chunkGenerator = chunkGenerator;
      this.structureTemplateManager = structureTemplateManager;
      this.chunkPos = chunkPos;
      this.heightAccessor = heightAccessor;
      this.random = random;
      this.seed = seed;
   }

   public class05474 i() {
      return this.heightAccessor;
   }

   public class07321 u() {
      return this.chunkPos;
   }

   public class08088 y() {
      return this.chunkGenerator;
   }

   public C N() {
      return this.config;
   }

   public class07836 R() {
      return this.random;
   }
}
