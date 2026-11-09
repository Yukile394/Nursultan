package minecraft;

import com.google.common.collect.Sets;
import java.util.Set;

public record class00482(
   int playerId,
   boolean hardcore,
   Set<class05946<class07299>> levels,
   int maxPlayers,
   int chunkRadius,
   int simulationDistance,
   boolean reducedDebugInfo,
   boolean showDeathScreen,
   boolean doLimitedCrafting,
   class04167 commonPlayerSpawnInfo,
   boolean enforcesSecureChat
) implements class00381<class07280> {
   public static final class02362<class04247, class00482> N = class00381.N(class00482::N, class00482::new);

   public Set<class05946<class07299>> L() {
      return this.levels;
   }

   public int M() {
      return this.chunkRadius;
   }

   public class00482(
      int playerId,
      boolean hardcore,
      Set<class05946<class07299>> levels,
      int maxPlayers,
      int chunkRadius,
      int simulationDistance,
      boolean reducedDebugInfo,
      boolean showDeathScreen,
      boolean doLimitedCrafting,
      class04167 commonPlayerSpawnInfo,
      boolean enforcesSecureChat
   ) {
      this.playerId = playerId;
      this.hardcore = hardcore;
      this.levels = levels;
      this.maxPlayers = maxPlayers;
      this.chunkRadius = chunkRadius;
      this.simulationDistance = simulationDistance;
      this.reducedDebugInfo = reducedDebugInfo;
      this.showDeathScreen = showDeathScreen;
      this.doLimitedCrafting = doLimitedCrafting;
      this.commonPlayerSpawnInfo = commonPlayerSpawnInfo;
      this.enforcesSecureChat = enforcesSecureChat;
   }

   private class00482(class04247 var1) {
      this(
         var1.readInt(),
         var1.readBoolean(),
         var1.N_15(Sets::newHashSetWithExpectedSize, var0 -> var0.N(class04227.yg)),
         var1.E(),
         var1.E(),
         var1.E(),
         var1.readBoolean(),
         var1.readBoolean(),
         var1.readBoolean(),
         new class04167(var1),
         var1.readBoolean()
      );
   }

   public int B() {
      return this.simulationDistance;
   }

   public boolean Z() {
      return this.reducedDebugInfo;
   }

   public boolean U() {
      return this.doLimitedCrafting;
   }

   public boolean z() {
      return this.showDeathScreen;
   }

   public int u() {
      return this.maxPlayers;
   }

   public boolean y() {
      return this.hardcore;
   }

   public class04167 E() {
      return this.commonPlayerSpawnInfo;
   }

   private void N(class04247 var1) {
      var1.writeInt(this.playerId);
      var1.writeBoolean(this.hardcore);
      var1.N_12(this.levels, class00667::y);
      var1.L(this.maxPlayers);
      var1.L(this.chunkRadius);
      var1.L(this.simulationDistance);
      var1.writeBoolean(this.reducedDebugInfo);
      var1.writeBoolean(this.showDeathScreen);
      var1.writeBoolean(this.doLimitedCrafting);
      this.commonPlayerSpawnInfo.N(var1);
      var1.writeBoolean(this.enforcesSecureChat);
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public int N() {
      return this.playerId;
   }

   public boolean W() {
      return this.enforcesSecureChat;
   }

   @Override
   public class02897<class00482> method_65080() {
      return class04248.f;
   }
}
