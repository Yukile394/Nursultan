package minecraft;

import java.util.function.Predicate;

public record class03158<C extends class06386>(
   class08088 chunkGenerator,
   class00765 biomeSource,
   class04084 randomState,
   long seed,
   class07321 chunkPos,
   C config,
   class05474 heightAccessor,
   Predicate<class03556<class00780>> validBiome,
   class01224 structureTemplateManager,
   class01042 registryAccess
) {
   public class04084 L() {
      return this.randomState;
   }

   public class05474 M() {
      return this.heightAccessor;
   }

   public class03158(
      class08088 chunkGenerator,
      class00765 biomeSource,
      class04084 randomState,
      long seed,
      class07321 chunkPos,
      C config,
      class05474 heightAccessor,
      Predicate<class03556<class00780>> validBiome,
      class01224 structureTemplateManager,
      class01042 registryAccess
   ) {
      super();
      this.chunkGenerator = chunkGenerator;
      this.biomeSource = biomeSource;
      this.randomState = randomState;
      this.seed = seed;
      this.chunkPos = chunkPos;
      this.config = (C)config;
      this.heightAccessor = heightAccessor;
      this.validBiome = validBiome;
      this.structureTemplateManager = structureTemplateManager;
      this.registryAccess = registryAccess;
   }

   public Predicate<class03556<class00780>> B() {
      return this.validBiome;
   }

   public class01224 Z() {
      return this.structureTemplateManager;
   }

   public class07321 i() {
      return this.chunkPos;
   }

   public class01042 z() {
      return this.registryAccess;
   }

   public long u() {
      return this.seed;
   }

   public class00765 y() {
      return this.biomeSource;
   }

   public boolean N(class07830 var1) {
      int i = this.chunkPos.L();
      int j = this.chunkPos.u();
      int k = this.chunkGenerator.L(i, j, var1, this.heightAccessor, this.randomState);
      class03556<class00780> class03556 = this.chunkGenerator.u().method_38109(class01146.N(i), class01146.N(k), class01146.N(j), this.randomState.y());
      return this.validBiome.test(class03556);
   }

   public class08088 N() {
      return this.chunkGenerator;
   }

   public C R() {
      return this.config;
   }
}
