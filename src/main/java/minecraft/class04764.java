package minecraft;

import java.util.function.Predicate;

public record class04764(
   class01042 registryAccess,
   class08088 chunkGenerator,
   class00765 biomeSource,
   class04084 randomState,
   class01224 structureTemplateManager,
   class07836 random,
   long seed,
   class07321 chunkPos,
   class05474 heightAccessor,
   Predicate<class03556<class00780>> validBiome
) {

   public class00765 L() {
      return this.biomeSource;
   }

   public long M() {
      return this.seed;
   }

   public class04764(
      class01042 var1,
      class08088 var2,
      class00765 var3,
      class04084 var4,
      class01224 var5,
      long var6,
      class07321 var8,
      class05474 var9,
      Predicate<class03556<class00780>> var10
   ) {
      this(var1, var2, var3, var4, var5, N(var6, var8), var6, var8, var9, var10);
   }

   public class04764(
      class01042 registryAccess,
      class08088 chunkGenerator,
      class00765 biomeSource,
      class04084 randomState,
      class01224 structureTemplateManager,
      class07836 random,
      long seed,
      class07321 chunkPos,
      class05474 heightAccessor,
      Predicate<class03556<class00780>> validBiome
   ) {
      this.registryAccess = registryAccess;
      this.chunkGenerator = chunkGenerator;
      this.biomeSource = biomeSource;
      this.randomState = randomState;
      this.structureTemplateManager = structureTemplateManager;
      this.random = random;
      this.seed = seed;
      this.chunkPos = chunkPos;
      this.heightAccessor = heightAccessor;
      this.validBiome = validBiome;
   }

   public class07321 B() {
      return this.chunkPos;
   }

   public class05474 Z() {
      return this.heightAccessor;
   }

   public class01224 i() {
      return this.structureTemplateManager;
   }

   public Predicate<class03556<class00780>> z() {
      return this.validBiome;
   }

   public class04084 u() {
      return this.randomState;
   }

   public class08088 y() {
      return this.chunkGenerator;
   }

   private static class07836 N(long var0, class07321 var2) {
      class07836 class07836 = new class07836(new class06075(0L));
      class07836.L(var0, var2.B, var2.Z);
      return class07836;
   }

   public class01042 N() {
      return this.registryAccess;
   }

   public class07836 R() {
      return this.random;
   }
}
