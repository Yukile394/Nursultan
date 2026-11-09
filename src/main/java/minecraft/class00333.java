package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.HashMap;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.rendering.SpecialBlockRendererRegistryImpl;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
public class class00333 {
   public static final class06333<class01894, MapCodec<? extends class00335>> N = new class06333<>();
   public static final Codec<class00335> y = N.N(class01894.N).dispatch(class00335::N, var0 -> var0);
   private static Map<class00891, class00335> L = ImmutableMap.builder()
      .put(class00869.Bt, new class00355(class07032.field_11512))
      .put(class00869.Bw, new class00355(class07032.field_11508))
      .put(class00869.BO, new class00355(class07032.field_11507))
      .put(class00869.BI, new class00355(class07032.field_11511))
      .put(class00869.Bo, new class00355(class07032.field_41313))
      .put(class00869.BY, new class08767())
      .put(class00869.Bl, new class00355(class07032.field_11513))
      .put(class00869.BG, new class00355(class07032.field_11512))
      .put(class00869.Bk, new class00355(class07032.field_11508))
      .put(class00869.Bg, new class00355(class07032.field_11507))
      .put(class00869.BJ, new class00355(class07032.field_11511))
      .put(class00869.Bq, new class00355(class07032.field_41313))
      .put(class00869.BQ, new class08767())
      .put(class00869.Bd, new class00355(class07032.field_11513))
      .put(class00869.zY, new class00364(class06563.field_7952))
      .put(class00869.zQ, new class00364(class06563.field_7946))
      .put(class00869.zO, new class00364(class06563.field_7958))
      .put(class00869.zg, new class00364(class06563.field_7951))
      .put(class00869.zI, new class00364(class06563.field_7947))
      .put(class00869.zJ, new class00364(class06563.field_7961))
      .put(class00869.zo, new class00364(class06563.field_7954))
      .put(class00869.zq, new class00364(class06563.field_7944))
      .put(class00869.zK, new class00364(class06563.field_7967))
      .put(class00869.zV, new class00364(class06563.field_7955))
      .put(class00869.ze, new class00364(class06563.field_7945))
      .put(class00869.zH, new class00364(class06563.field_7966))
      .put(class00869.zc, new class00364(class06563.field_7957))
      .put(class00869.zX, new class00364(class06563.field_7942))
      .put(class00869.za, new class00364(class06563.field_7964))
      .put(class00869.zp, new class00364(class06563.field_7963))
      .put(class00869.zF, new class00364(class06563.field_7952))
      .put(class00869.zA, new class00364(class06563.field_7946))
      .put(class00869.zf, new class00364(class06563.field_7958))
      .put(class00869.zC, new class00364(class06563.field_7951))
      .put(class00869.zS, new class00364(class06563.field_7947))
      .put(class00869.zx, new class00364(class06563.field_7961))
      .put(class00869.zD, new class00364(class06563.field_7954))
      .put(class00869.zh, new class00364(class06563.field_7944))
      .put(class00869.zr, new class00364(class06563.field_7967))
      .put(class00869.UN, new class00364(class06563.field_7955))
      .put(class00869.Uy, new class00364(class06563.field_7945))
      .put(class00869.UL, new class00364(class06563.field_7966))
      .put(class00869.Uu, new class00364(class06563.field_7957))
      .put(class00869.Ui, new class00364(class06563.field_7942))
      .put(class00869.UR, new class00364(class06563.field_7964))
      .put(class00869.UM, new class00364(class06563.field_7963))
      .put(class00869.yM, new class00346(class06563.field_7952))
      .put(class00869.yB, new class00346(class06563.field_7946))
      .put(class00869.yZ, new class00346(class06563.field_7958))
      .put(class00869.yz, new class00346(class06563.field_7951))
      .put(class00869.yU, new class00346(class06563.field_7947))
      .put(class00869.yE, new class00346(class06563.field_7961))
      .put(class00869.yW, new class00346(class06563.field_7954))
      .put(class00869.ym, new class00346(class06563.field_7944))
      .put(class00869.yP, new class00346(class06563.field_7967))
      .put(class00869.ys, new class00346(class06563.field_7955))
      .put(class00869.yT, new class00346(class06563.field_7945))
      .put(class00869.yb, new class00346(class06563.field_7966))
      .put(class00869.yj, new class00346(class06563.field_7957))
      .put(class00869.yv, new class00346(class06563.field_7942))
      .put(class00869.yn, new class00346(class06563.field_7964))
      .put(class00869.yt, new class00346(class06563.field_7963))
      .put(class00869.Ee, new class00357())
      .put(class00869.EH, new class00357(class06563.field_7952))
      .put(class00869.Ec, new class00357(class06563.field_7946))
      .put(class00869.EX, new class00357(class06563.field_7958))
      .put(class00869.Ea, new class00357(class06563.field_7951))
      .put(class00869.Ep, new class00357(class06563.field_7947))
      .put(class00869.EF, new class00357(class06563.field_7961))
      .put(class00869.EA, new class00357(class06563.field_7954))
      .put(class00869.Ef, new class00357(class06563.field_7944))
      .put(class00869.EC, new class00357(class06563.field_7967))
      .put(class00869.ES, new class00357(class06563.field_7955))
      .put(class00869.Ex, new class00357(class06563.field_7945))
      .put(class00869.ED, new class00357(class06563.field_7966))
      .put(class00869.Eh, new class00357(class06563.field_7957))
      .put(class00869.Er, new class00357(class06563.field_7942))
      .put(class00869.WN, new class00357(class06563.field_7964))
      .put(class00869.Wy, new class00357(class06563.field_7963))
      .put(class00869.uy, new class08343(class05904.y))
      .put(class00869.uL, new class08343(class05904.L))
      .put(class00869.uu, new class08343(class05904.u))
      .put(class00869.ui, new class08343(class05904.i))
      .put(class00869.uR, new class08343(class05904.R))
      .put(class00869.uM, new class08343(class05904.M))
      .put(class00869.uB, new class08343(class05904.B))
      .put(class00869.uZ, new class08343(class05904.Z))
      .put(class00869.uz, new class08343(class05904.E))
      .put(class00869.uU, new class08343(class05904.W))
      .put(class00869.sC, new class08343(class05904.z))
      .put(class00869.sS, new class08343(class05904.U))
      .put(class00869.us, new class08343(class05904.y))
      .put(class00869.uT, new class08343(class05904.L))
      .put(class00869.ub, new class08343(class05904.u))
      .put(class00869.uj, new class08343(class05904.i))
      .put(class00869.uv, new class08343(class05904.R))
      .put(class00869.un, new class08343(class05904.M))
      .put(class00869.ut, new class08343(class05904.B))
      .put(class00869.uG, new class08343(class05904.Z))
      .put(class00869.ul, new class08343(class05904.E))
      .put(class00869.ud, new class08343(class05904.W))
      .put(class00869.sx, new class08343(class05904.z))
      .put(class00869.sD, new class08343(class05904.U))
      .put(class00869.uw, new class08390(class05904.y))
      .put(class00869.uk, new class08390(class05904.L))
      .put(class00869.uY, new class08390(class05904.u))
      .put(class00869.uQ, new class08390(class05904.i))
      .put(class00869.uO, new class08390(class05904.R))
      .put(class00869.ug, new class08390(class05904.M))
      .put(class00869.uI, new class08390(class05904.B))
      .put(class00869.uJ, new class08390(class05904.Z))
      .put(class00869.uK, new class08390(class05904.E))
      .put(class00869.uV, new class08390(class05904.W))
      .put(class00869.uo, new class08390(class05904.z))
      .put(class00869.uq, new class08390(class05904.U))
      .put(class00869.ue, new class08390(class05904.y))
      .put(class00869.uH, new class08390(class05904.L))
      .put(class00869.uc, new class08390(class05904.u))
      .put(class00869.uX, new class08390(class05904.i))
      .put(class00869.ua, new class08390(class05904.R))
      .put(class00869.up, new class08390(class05904.M))
      .put(class00869.uF, new class08390(class05904.B))
      .put(class00869.uA, new class08390(class05904.Z))
      .put(class00869.uf, new class08390(class05904.E))
      .put(class00869.ux, new class08390(class05904.W))
      .put(class00869.uC, new class08390(class05904.z))
      .put(class00869.uS, new class08390(class05904.U))
      .put(class00869.mC, new class00339())
      .put(class00869.LA, new class00360(class00344.y))
      .put(class00869.BH, new class00360(class00344.L))
      .put(class00869.Mt, new class00360(class00344.u))
      .put(class00869.vj, new class00360(class00344.i))
      .put(class00869.vv, new class00360(class00344.R))
      .put(class00869.vn, new class00360(class00344.M))
      .put(class00869.vt, new class00360(class00344.B))
      .put(class00869.vG, new class00360(class00344.i))
      .put(class00869.vl, new class00360(class00344.R))
      .put(class00869.vd, new class00360(class00344.M))
      .put(class00869.vw, new class00360(class00344.B))
      .put(class00869.vk, new class08106(class02774.field_28704, class08973.field_61414))
      .put(class00869.vY, new class08106(class02774.field_28705, class08973.field_61414))
      .put(class00869.vQ, new class08106(class02774.field_28706, class08973.field_61414))
      .put(class00869.vO, new class08106(class02774.field_28707, class08973.field_61414))
      .put(class00869.vg, new class08106(class02774.field_28704, class08973.field_61414))
      .put(class00869.vI, new class08106(class02774.field_28705, class08973.field_61414))
      .put(class00869.vJ, new class08106(class02774.field_28706, class08973.field_61414))
      .put(class00869.vo, new class08106(class02774.field_28707, class08973.field_61414))
      .put(class00869.nX, new class00369())
      .build();
   private static final class00360 u = new class00360(class00344.N);

   public class00333() {
      super();
   }

   private static void N(CallbackInfo var0) {
      if (!(L instanceof HashMap)) {
         L = new HashMap<>(L);
      }

      SpecialBlockRendererRegistryImpl.setup(L::put);
   }

   public static Map<class00891, class00368<?>> N(class00331 var0) {
      HashMap hashmap = new HashMap<>(L);
      if (class03343.N()) {
         hashmap.put(class00869.LA, u);
         hashmap.put(class00869.BH, u);
      }

      Builder builder = ImmutableMap.builder();
      hashmap.forEach((var2x, var3) -> {
         class00368<?> class00368 = var3.N(var0);
         if (class00368 != null) {
            builder.put(var2x, class00368);
         }
      });
      return builder.build();
   }

   public static void N() {
      N.N(class01894.y("bed"), class00346.N);
      N.N(class01894.y("banner"), class00364.N);
      N.N(class01894.y("conduit"), class00339.N);
      N.N(class01894.y("chest"), class00360.N);
      N.N(class01894.y("copper_golem_statue"), class08106.N);
      N.N(class01894.y("head"), class00355.N);
      N.N(class01894.y("player_head"), class08767.N);
      N.N(class01894.y("shulker_box"), class00357.N);
      N.N(class01894.y("shield"), class00358.y);
      N.N(class01894.y("trident"), class00376.N);
      N.N(class01894.y("decorated_pot"), class00369.N);
      N.N(class01894.y("standing_sign"), class08343.N);
      N.N(class01894.y("hanging_sign"), class08390.N);
   }
}
