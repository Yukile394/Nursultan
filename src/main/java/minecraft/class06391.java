package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class class06391<FC extends class06386> {
   public static final class06391<class06225> N = N("no_op", new class05902(class06225.y));
   public static final class06391<class01476> y = N("tree", new class03194(class01476.N));
   public static final class06391<class08531> L = N("fallen_tree", new class08518(class08531.N));
   public static final class06391<class01478> u = N("flower", new class01447(class01478.N));
   public static final class06391<class01478> i = N("no_bonemeal_flower", new class01447(class01478.N));
   public static final class06391<class01478> R = N("random_patch", new class01447(class01478.N));
   public static final class06391<class01458> M = N("block_pile", new class05241(class01458.N));
   public static final class06391<class01470> B = N("spring_feature", new class04754(class01470.N));
   public static final class06391<class06225> Z = N("chorus_plant", new class03613(class06225.y));
   public static final class06391<class05591> z = N("replace_single_block", new class05621(class05591.N));
   public static final class06391<class06225> U = N("void_start_platform", new class04781(class06225.y));
   public static final class06391<class06225> E = N("desert_well", new class06393(class06225.y));
   public static final class06391<class02670> W = N("fossil", new class06422(class02670.N));
   public static final class06391<class01466> m = N("huge_red_mushroom", new class01565(class01466.N));
   public static final class06391<class01466> P = N("huge_brown_mushroom", new class01552(class01466.N));
   public static final class06391<class06225> s = N("ice_spike", new class01572(class06225.y));
   public static final class06391<class06225> T = N("glowstone_blob", new class01580(class06225.y));
   public static final class06391<class06225> b = N("freeze_top_layer", new class04756(class06225.y));
   public static final class06391<class06225> j = N("vines", new class04772(class06225.y));
   public static final class06391<class04055> v = N("block_column", new class04035(class04055.N));
   public static final class06391<class02256> n = N("vegetation_patch", new class02616(class02256.N));
   public static final class06391<class02256> t = N("waterlogged_vegetation_patch", new class02458(class02256.N));
   public static final class06391<class02673> G = N("root_system", new class02722(class02673.N));
   public static final class06391<class05583> l = N("multiface_growth", new class05572(class05583.N));
   public static final class06391<class06076> d = N("underwater_magma", new class06070(class06076.N));
   public static final class06391<class06225> w = N("monster_room", new class06224(class06225.y));
   public static final class06391<class06225> k = N("blue_ice", new class03863(class06225.y));
   public static final class06391<class03967> Y = N("iceberg", new class01554(class03967.N));
   public static final class06391<class03967> Q = N("forest_rock", new class03147(class03967.N));
   public static final class06391<class01812> O = N("disk", new class06396(class01812.N));
   public static final class06391<class01579> g = N("lake", new class01551(class01579.N));
   public static final class06391<class06191> I = N("ore", new class06203(class06191.N));
   public static final class06391<class06225> J = N("end_platform", new class02611(class06225.y));
   public static final class06391<class04685> o = N("end_spike", new class01058(class04685.N));
   public static final class06391<class06225> q = N("end_island", new class06397(class06225.y));
   public static final class06391<class06414> K = N("end_gateway", new class06389(class06414.N));
   public static final class05594 V = N("seagrass", new class05594(class06212.N));
   public static final class06391<class06225> e = N("kelp", new class01536(class06225.y));
   public static final class06391<class06225> H = N("coral_tree", new class03324(class06225.y));
   public static final class06391<class06225> c = N("coral_mushroom", new class01936(class06225.y));
   public static final class06391<class06225> X = N("coral_claw", new class04103(class06225.y));
   public static final class06391<class01630> a = N("sea_pickle", new class05619(class01630.N));
   public static final class06391<class05610> p = N("simple_block", new class05612(class05610.N));
   public static final class06391<class06212> F = N("bamboo", new class03087(class06212.N));
   public static final class06391<class06020> A = N("huge_fungus", new class05986(class06020.N));
   public static final class06391<class04316> f = N("nether_forest_vegetation", new class05981(class04316.L));
   public static final class06391<class06225> C = N("weeping_vines", new class06011(class06225.y));
   public static final class06391<class04329> S = N("twisting_vines", new class01347(class04329.N));
   public static final class06391<class05302> x = N("basalt_columns", new class05284(class05302.N));
   public static final class06391<class05332> D = N("delta_feature", new class05315(class05332.N));
   public static final class06391<class01041> h = N("netherrack_replace_blobs", new class05286(class01041.N));
   public static final class06391<class05718> r = N("fill_layer", new class05702(class05718.N));
   public static final class03514 NN = N("bonus_chest", new class03514(class06225.y));
   public static final class06391<class06225> Ny = N("basalt_pillar", new class06003(class06225.y));
   public static final class06391<class06191> NL = N("scattered_ore", new class06035(class06191.N));
   public static final class06391<class05629> Nu = N("random_selector", new class05618(class05629.N));
   public static final class06391<class05602> Ni = N("simple_random_selector", new class05587(class05602.N));
   public static final class06391<class06189> NR = N("random_boolean_selector", new class06201(class06189.N));
   public static final class06391<class01100> NM = N("geode", new class01132(class01100.y));
   public static final class06391<class01154> NB = N("dripstone_cluster", new class01158(class01154.N));
   public static final class06391<class01165> NZ = N("large_dripstone", new class01152(class01165.N));
   public static final class06391<class01173> Nz = N("pointed_dripstone", new class01185(class01173.N));
   public static final class06391<class04059> NU = N("sculk_patch", new class04100(class04059.N));
   private final MapCodec<class03238<FC, class06391<FC>>> NE;

   public class06391(Codec<FC> var1) {
      super();
      this.NE = var1.fieldOf("config").xmap(var1x -> new class03238<>(this, var1x), class03238::L);
   }

   public static boolean u(class04887 var0, class07209 var1) {
      return var0.method_16358(var1, class06391::y);
   }

   public static boolean y(class00500 var0) {
      return var0.N(class01210.Ni);
   }

   protected void N_59(class05974 var1, class07209 var2) {
      class07218 class07218 = var2.method_25503();

      for (int ix = 0; ix < 2; ix++) {
         class07218.N(class07211.field_11036);
         if (var1.method_8320(class07218).P()) {
            return;
         }

         var1.method_8500(class07218).u(class07218);
      }
   }

   private static <C extends class06386, F extends class06391<C>> F N(String var0, F var1) {
      return class00751.N(class04206.X, var0, (F)var1);
   }

   public static boolean N(Function<class07209, class00500> var0, class07209 var1, Predicate<class00500> var2) {
      class07218 class07218 = new class07218();

      for (class07211 class07211 : class07211.values()) {
         class07218.N(var1, class07211);
         if (var2.test((class00500)var0.apply(class07218))) {
            return true;
         }
      }

      return false;
   }

   public static boolean N(Function<class07209, class00500> var0, class07209 var1) {
      return N(var0, var1, class01339::P);
   }

   protected void N(class05974 var1, class07209 var2, class00500 var3, Predicate<class00500> var4) {
      if (var4.test(var1.method_8320(var2))) {
         var1.method_8652(var2, var3, 2);
      }
   }

   public static Predicate<class00500> N(class03530<class00891> var0) {
      return var1 -> !var1.N(var0);
   }

   protected void N(class00807 var1, class07209 var2, class00500 var3) {
      var1.method_8652(var2, var3, 3);
   }

   public MapCodec<class03238<FC, class06391<FC>>> N() {
      return this.NE;
   }

   public abstract boolean N(class06058<FC> var1);

   public boolean N(FC var1, class05974 var2, class08088 var3, class06069 var4, class07209 var5) {
      return var2.u(var5) ? this.N(new class06058<>(Optional.empty(), var2, var3, var4, var5, (FC)var1)) : false;
   }

   protected static boolean N(class00500 var0) {
      return var0.N(class01210.yb);
   }
}
