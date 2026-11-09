package minecraft;

import com.mojang.authlib.GameProfile;
import com.viaversion.viafabricplus.visuals.features.r1_7_tab_list_style.LegacyTabList;
import com.viaversion.viafabricplus.visuals.injection.access.r1_7_tab_list_tyle.IPlayerInfo;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class class03458 implements IPlayerInfo {
   private final GameProfile N;
   @Nullable
   private Supplier<class01631> y;
   private class07282 L;
   private int u;
   @Nullable
   private class00392 i;
   private boolean R;
   @Nullable
   private class02027 M;
   private class03072 B;
   private int Z;
   private final int z = LegacyTabList.globalTablistIndex++;

   public class03072 L() {
      return this.B;
   }

   private static class03072 L(boolean var0) {
      return var0 ? class03072.L : class03072.y;
   }

   public class01631 M() {
      if (this.y == null) {
         this.y = N(this.N);
      }

      return this.y.get();
   }

   public class03458(GameProfile var1, boolean var2) {
      super();
      this.L = class07282.field_28045;
      this.R = true;
      this.N = var1;
      this.B = L(var2);
   }

   @Nullable
   public class00502 B() {
      return ((class03448)class06202.Nq().T_3).method_8428().i(this.N().name());
   }

   @Nullable
   public class00392 Z() {
      return this.i;
   }

   public class07282 i() {
      return this.L;
   }

   public int U() {
      return this.Z;
   }

   public boolean z() {
      return this.R;
   }

   public boolean u() {
      return this.M != null;
   }

   public void y(boolean var1) {
      this.R = var1;
   }

   @Nullable
   public class02027 y() {
      return this.M;
   }

   public void y(int var1) {
      this.Z = var1;
   }

   private static Supplier<class01631> N(GameProfile var0) {
      class06202 class06202 = class06202.Nq();
      boolean flag = !class06202.y(var0.id());
      return class06202.yP().N(var0, flag);
   }

   public GameProfile N() {
      return this.N;
   }

   protected void N(class07282 var1) {
      this.L = var1;
   }

   protected void N(int var1) {
      this.u = var1;
   }

   protected void N(boolean var1) {
      this.M = null;
      this.B = L(var1);
   }

   protected void N(class02027 var1) {
      this.M = var1;
      this.B = var1.N(class04470.y);
   }

   public void N(@Nullable class00392 var1) {
      this.i = var1;
   }

   public int R() {
      return this.u;
   }

   public int viaFabricPlusVisuals$getIndex() {
      return this.z;
   }
}
