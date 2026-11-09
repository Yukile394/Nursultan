package minecraft;

import java.util.Set;

public record class01032(
   class04782 newLevel,
   class06889 position,
   class06889 deltaMovement,
   float yRot,
   float xRot,
   boolean missingRespawnBlock,
   boolean asPassenger,
   Set<class06681> relatives,
   class01026 postTeleportTransition
) {
   public static final class01026 N = var0 -> {};
   public static final class01026 y = class01032::N;
   public static final class01026 L = class01032::y;

   public class06889 L() {
      return this.position;
   }

   public boolean M() {
      return this.missingRespawnBlock;
   }

   public class01032(class04782 var1, class06889 var2, class06889 var3, float var4, float var5, class01026 var6) {
      this(var1, var2, var3, var4, var5, Set.of(), var6);
   }

   public class01032(
      class04782 newLevel,
      class06889 position,
      class06889 deltaMovement,
      float yRot,
      float xRot,
      boolean missingRespawnBlock,
      boolean asPassenger,
      Set<class06681> relatives,
      class01026 postTeleportTransition
   ) {
      super();
      this.newLevel = newLevel;
      this.position = position;
      this.deltaMovement = deltaMovement;
      this.yRot = yRot;
      this.xRot = xRot;
      this.missingRespawnBlock = missingRespawnBlock;
      this.asPassenger = asPassenger;
      this.relatives = relatives;
      this.postTeleportTransition = postTeleportTransition;
   }

   public class01032(class04782 var1, class06889 var2, class06889 var3, float var4, float var5, Set<class06681> var6, class01026 var7) {
      this(var1, var2, var3, var4, var5, false, false, var6, var7);
   }

   public boolean B() {
      return this.asPassenger;
   }

   public Set<class06681> Z() {
      return this.relatives;
   }

   public float i() {
      return this.yRot;
   }

   public class01026 z() {
      return this.postTeleportTransition;
   }

   public class06889 u() {
      return this.deltaMovement;
   }

   private static void y(class07049 var0) {
      var0.method_60950(class07209.method_49638(var0.method_73189()));
   }

   public class04782 y() {
      return this.newLevel;
   }

   public static class01032 y(class04770 var0, class01026 var1) {
      class04782 class04782 = var0.method_51469().method_8503().yi();
      class05042 class05042 = class04782.method_74854();
      return new class01032(class04782, N(class04782, var0), class06889.L, class05042.u(), class05042.i(), true, false, Set.of(), var1);
   }

   public class01032 N(float var1, float var2) {
      return new class01032(this.y(), this.L(), this.u(), var1, var2, this.M(), this.B(), this.Z(), this.z());
   }

   public class01032 N(class06889 var1) {
      return new class01032(this.y(), var1, this.u(), this.i(), this.R(), this.M(), this.B(), this.Z(), this.z());
   }

   private static void N(class07049 var0) {
      if (var0 instanceof class04770) {
         ((class04770)var0).field_13987.method_14364(new class00516(1032, class07209.field_10980, 0, false));
      }
   }

   private static class06889 N(class04782 var0, class07049 var1) {
      return var1.method_14245(var0, var0.method_74854().y()).method_61082();
   }

   public class01032 N() {
      return new class01032(this.y(), this.L(), this.u(), this.i(), this.R(), this.M(), true, this.Z(), this.z());
   }

   public static class01032 N(class04770 var0, class01026 var1) {
      class04782 class04782 = var0.method_51469().method_8503().yi();
      class05042 class05042 = class04782.method_74854();
      return new class01032(class04782, N(class04782, var0), class06889.L, class05042.u(), class05042.i(), false, false, Set.of(), var1);
   }

   public float R() {
      return this.xRot;
   }
}
