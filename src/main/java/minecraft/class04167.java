package minecraft;

import java.util.Optional;
import org.jspecify.annotations.Nullable;

public record class04167(
   class03556<class07376> dimensionType,
   class05946<class07299> dimension,
   long seed,
   class07282 gameType,
   class07282 previousGameType,
   boolean isDebug,
   boolean isFlat,
   Optional<class06289> lastDeathLocation,
   int portalCooldown,
   int seaLevel
) {
   public long L() {
      return this.seed;
   }

   public boolean M() {
      return this.isFlat;
   }

   public class04167(class04247 var1) {
      this(
         class07376.z.decode(var1),
         var1.N(class04227.yg),
         var1.readLong(),
         class07282.N(var1.readByte()),
         class07282.y(var1.readByte()),
         var1.readBoolean(),
         var1.readBoolean(),
         var1.y(class00667::M),
         var1.E(),
         var1.E()
      );
   }

   public class04167(
      class03556<class07376> dimensionType,
      class05946<class07299> dimension,
      long seed,
      class07282 gameType,
      @Nullable class07282 previousGameType,
      boolean isDebug,
      boolean isFlat,
      Optional<class06289> lastDeathLocation,
      int portalCooldown,
      int seaLevel
   ) {
      this.dimensionType = dimensionType;
      this.dimension = dimension;
      this.seed = seed;
      this.gameType = gameType;
      this.previousGameType = previousGameType;
      this.isDebug = isDebug;
      this.isFlat = isFlat;
      this.lastDeathLocation = lastDeathLocation;
      this.portalCooldown = portalCooldown;
      this.seaLevel = seaLevel;
   }

   public Optional<class06289> B() {
      return this.lastDeathLocation;
   }

   public int Z() {
      return this.portalCooldown;
   }

   @Nullable
   public class07282 i() {
      return this.previousGameType;
   }

   public int z() {
      return this.seaLevel;
   }

   public class07282 u() {
      return this.gameType;
   }

   public class05946<class07299> y() {
      return this.dimension;
   }

   public void N(class04247 var1) {
      class07376.z.encode(var1, this.dimensionType);
      var1.y(this.dimension);
      var1.writeLong(this.seed);
      var1.writeByte(this.gameType.N());
      var1.writeByte(class07282.N(this.previousGameType));
      var1.writeBoolean(this.isDebug);
      var1.writeBoolean(this.isFlat);
      var1.N_13(this.lastDeathLocation, class00667::N);
      var1.L(this.portalCooldown);
      var1.L(this.seaLevel);
   }

   public class03556<class07376> N() {
      return this.dimensionType;
   }

   public boolean R() {
      return this.isDebug;
   }
}
