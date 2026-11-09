package minecraft;

import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.Iterator;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;
import net.fabricmc.fabric.impl.object.builder.FabricEntityTypeImpl;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07078<T extends class07049> implements class01128<class07049, T>, class02995, FabricEntityTypeImpl {
   private static final Logger LR = LogUtils.getLogger();
   private final class03529<class07078<?>> LM = class04206.M.R(this);
   public static final Codec<class07078<?>> N = class04206.M.T();
   public static final class02362<class04247, class07078<?>> y = class02389.N(class04227.I);
   private static final float LB = 1.3964844F;
   private static final int LZ = 10;
   public static final class07078<class07487> L = N(
      "acacia_boat", class07045.N(N((Supplier<class06581>)(() -> class06570.sw)), class07428.field_17715).i().N(1.375F, 0.5625F).y(0.5625F).N(10)
   );
   public static final class07078<class03976> u = N(
      "acacia_chest_boat", class07045.N(u(() -> class06570.sk), class07428.field_17715).i().N(1.375F, 0.5625F).y(0.5625F).N(10)
   );
   public static final class07078<class03630> i = N("allay", class07045.N(class03630::new, class07428.field_6294).N(0.35F, 0.6F).y(0.36F).L(0.04F).N(8).y(2));
   public static final class07078<class07048> R = N(
      "area_effect_cloud", class07045.<class07048>N(class07048::new, class07428.field_17715).i().L().N(6.0F, 0.5F).N(10).y(Integer.MAX_VALUE)
   );
   public static final class07078<class03811> M = N("armadillo", class07045.N(class03811::new, class07428.field_6294).N(0.7F, 0.65F).y(0.26F).N(10));
   public static final class07078<class00681> B = N(
      "armor_stand", class07045.<class00681>N(class00681::new, class07428.field_17715).N(0.5F, 1.975F).y(1.7775F).N(10)
   );
   public static final class07078<class08037> Z = N(
      "arrow", class07045.<class08037>N(class08037::new, class07428.field_17715).i().N(0.5F, 0.5F).y(0.13F).N(4).y(20)
   );
   public static final class07078<class05538> z = N("axolotl", class07045.N(class05538::new, class07428.field_34447).N(0.75F, 0.42F).y(0.2751F).N(10));
   public static final class07078<class00259> U = N(
      "bamboo_chest_raft", class07045.N(y((Supplier<class06581>)(() -> class06570.sV)), class07428.field_17715).i().N(1.375F, 0.5625F).y(0.5625F).N(10)
   );
   public static final class07078<class00267> E = N(
      "bamboo_raft", class07045.N(L(() -> class06570.sK), class07428.field_17715).i().N(1.375F, 0.5625F).y(0.5625F).N(10)
   );
   public static final class07078<class07632> W = N("bat", class07045.N(class07632::new, class07428.field_6303).N(0.5F, 0.9F).y(0.45F).N(5));
   public static final class07078<class04626> m = N("bee", class07045.N(class04626::new, class07428.field_6294).N(0.7F, 0.6F).y(0.3F).N(8));
   public static final class07078<class07487> P = N(
      "birch_boat", class07045.N(N((Supplier<class06581>)(() -> class06570.st)), class07428.field_17715).i().N(1.375F, 0.5625F).y(0.5625F).N(10)
   );
   public static final class07078<class03976> s = N(
      "birch_chest_boat", class07045.N(u(() -> class06570.sG), class07428.field_17715).i().N(1.375F, 0.5625F).y(0.5625F).N(10)
   );
   public static final class07078<class07530> T = N("blaze", class07045.N(class07530::new, class07428.field_6302).L().N(0.6F, 1.8F).N(8).R());
   public static final class07078<class03672> b = N("block_display", class07045.N(class03672::new, class07428.field_17715).i().N(0.0F, 0.0F).N(10).y(1));
   public static final class07078<class02839> j = N("bogged", class07045.N(class02839::new, class07428.field_6302).N(0.6F, 1.99F).y(1.74F).L(-0.7F).N(8).R());
   public static final class07078<class04508> v = N("breeze", class07045.N(class04508::new, class07428.field_6302).N(0.6F, 1.77F).y(1.3452F).N(10).R());
   public static final class07078<class02289> n = N(
      "breeze_wind_charge", class07045.<class02289>N(class02289::new, class07428.field_17715).i().N(0.3125F, 0.3125F).y(0.0F).N(4).y(10)
   );
   public static final class07078<class02976> t = N("camel", class07045.N(class02976::new, class07428.field_6294).N(1.7F, 2.375F).y(2.275F).N(10));
   public static final class07078<class06832> G = N("camel_husk", class07045.N(class06832::new, class07428.field_6302).N(1.7F, 2.375F).y(2.275F).N(10));
   public static final class07078<class07617> l = N("cat", class07045.N(class07617::new, class07428.field_6294).N(0.6F, 0.7F).y(0.35F).N(0.5125F).N(8));
   public static final class07078<class07534> d = N("cave_spider", class07045.N(class07534::new, class07428.field_6302).N(0.7F, 0.5F).y(0.45F).N(8).R());
   public static final class07078<class07487> w = N(
      "cherry_boat", class07045.N(N((Supplier<class06581>)(() -> class06570.sY)), class07428.field_17715).i().N(1.375F, 0.5625F).y(0.5625F).N(10)
   );
   public static final class07078<class03976> k = N(
      "cherry_chest_boat", class07045.N(u(() -> class06570.sQ), class07428.field_17715).i().N(1.375F, 0.5625F).y(0.5625F).N(10)
   );
   public static final class07078<class07498> Y = N("chest_minecart", class07045.N(class07498::new, class07428.field_17715).i().N(0.98F, 0.7F).N(0.1875F).N(8));
   public static final class07078<class07628> Q = N(
      "chicken", class07045.N(class07628::new, class07428.field_6294).N(0.4F, 0.7F).y(0.644F).N(new class06889(0.0, 0.7, -0.1)).N(10)
   );
   public static final class07078<class07644> O = N("cod", class07045.N(class07644::new, class07428.field_24460).N(0.5F, 0.3F).y(0.195F).N(4));
   public static final class07078<class08982> g = N("copper_golem", class07045.N(class08982::new, class07428.field_17715).N(0.49F, 0.98F).y(0.8125F).N(10));
   public static final class07078<class07480> I = N(
      "command_block_minecart", class07045.N(class07480::new, class07428.field_17715).i().N(0.98F, 0.7F).N(0.1875F).N(8)
   );
   public static final class07078<class08583> J = N("cow", class07045.N(class08583::new, class07428.field_6294).N(0.9F, 1.4F).y(1.3F).N(1.36875F).N(10));
   public static final class07078<class00245> o = N("creaking", class07045.N(class00245::new, class07428.field_6302).N(0.9F, 2.7F).y(2.3F).N(8).R());
   public static final class07078<class07550> q = N("creeper", class07045.N(class07550::new, class07428.field_6302).N(0.6F, 1.7F).N(8).R());
   public static final class07078<class07487> K = N(
      "dark_oak_boat", class07045.N(N((Supplier<class06581>)(() -> class06570.sO)), class07428.field_17715).i().N(1.375F, 0.5625F).y(0.5625F).N(10)
   );
   public static final class07078<class03976> V = N(
      "dark_oak_chest_boat", class07045.N(u(() -> class06570.sg), class07428.field_17715).i().N(1.375F, 0.5625F).y(0.5625F).N(10)
   );
   public static final class07078<class07618> e = N("dolphin", class07045.N(class07618::new, class07428.field_6300).N(0.9F, 0.6F).y(0.3F));
   public static final class07078<class07884> H = N(
      "donkey", class07045.N(class07884::new, class07428.field_6294).N(1.3964844F, 1.5F).y(1.425F).N(1.1125F).N(10)
   );
   public static final class07078<class08028> c = N(
      "dragon_fireball", class07045.<class08028>N(class08028::new, class07428.field_17715).i().N(1.0F, 1.0F).N(4).y(10)
   );
   public static final class07078<class07541> X = N(
      "drowned", class07045.N(class07541::new, class07428.field_6302).N(0.6F, 1.95F).y(1.74F).N(2.0125F).L(-0.7F).N(8).R()
   );
   public static final class07078<class08003> a = N("egg", class07045.<class08003>N(class08003::new, class07428.field_17715).i().N(0.25F, 0.25F).N(4).y(10));
   public static final class07078<class07520> p = N(
      "elder_guardian", class07045.N(class07520::new, class07428.field_6302).N(1.9975F, 1.9975F).y(0.99875F).N(2.350625F).N(10).R()
   );
   public static final class07078<class07525> F = N(
      "enderman", class07045.N(class07525::new, class07428.field_6302).N(0.6F, 2.9F).y(2.55F).N(2.80625F).N(8).R()
   );
   public static final class07078<class07560> A = N(
      "endermite", class07045.N(class07560::new, class07428.field_6302).N(0.4F, 0.3F).y(0.13F).N(0.2375F).N(8).R()
   );
   public static final class07078<class00690> f = N("ender_dragon", class07045.N(class00690::new, class07428.field_6302).L().N(16.0F, 8.0F).N(3.0F).N(10));
   public static final class07078<class07488> C = N(
      "ender_pearl", class07045.<class07488>N(class07488::new, class07428.field_17715).i().N(0.25F, 0.25F).N(4).y(10)
   );
   public static final class07078<class00676> S = N(
      "end_crystal", class07045.<class00676>N(class00676::new, class07428.field_17715).i().L().N(2.0F, 2.0F).N(16).y(Integer.MAX_VALUE)
   );
   public static final class07078<class07538> x = N("evoker", class07045.N(class07538::new, class07428.field_6302).N(0.6F, 1.95F).N(2.0F).L(-0.6F).N(8).R());
   public static final class07078<class08009> D = N(
      "evoker_fangs", class07045.<class08009>N(class08009::new, class07428.field_17715).i().N(0.5F, 0.8F).N(6).y(2)
   );
   public static final class07078<class08040> h = N(
      "experience_bottle", class07045.<class08040>N(class08040::new, class07428.field_17715).i().N(0.25F, 0.25F).N(4).y(10)
   );
   public static final class07078<class07057> r = N(
      "experience_orb", class07045.<class07057>N(class07057::new, class07428.field_17715).i().N(0.5F, 0.5F).N(6).y(20)
   );
   public static final class07078<class08026> NN = N(
      "eye_of_ender", class07045.<class08026>N(class08026::new, class07428.field_17715).i().N(0.25F, 0.25F).N(4).y(4)
   );
   public static final class07078<class00701> Ny = N(
      "falling_block", class07045.<class00701>N(class00701::new, class07428.field_17715).i().N(0.98F, 0.98F).N(10).y(20)
   );
   public static final class07078<class08024> NL = N("fireball", class07045.<class08024>N(class08024::new, class07428.field_17715).i().N(1.0F, 1.0F).N(4).y(10));
   public static final class07078<class08006> Nu = N(
      "firework_rocket", class07045.<class08006>N(class08006::new, class07428.field_17715).i().N(0.25F, 0.25F).N(4).y(10)
   );
   public static final class07078<class06165> Ni = N(
      "fox", class07045.N(class06165::new, class07428.field_6294).N(0.6F, 0.7F).y(0.4F).N(new class06889(0.0, 0.6375, -0.25)).N(8).N(class00869.sM)
   );
   public static final class07078<class04067> NR = N(
      "frog", class07045.N(class04067::new, class07428.field_6294).N(0.5F, 0.5F).N(new class06889(0.0, 0.375, -0.25)).N(10)
   );
   public static final class07078<class07494> NM = N(
      "furnace_minecart", class07045.N(class07494::new, class07428.field_17715).i().N(0.98F, 0.7F).N(0.1875F).N(8)
   );
   public static final class07078<class07523> NB = N(
      "ghast", class07045.N(class07523::new, class07428.field_6302).L().N(4.0F, 4.0F).y(2.6F).N(4.0625F).L(0.5F).N(10).R()
   );
   public static final class07078<class00032> NZ = N(
      "happy_ghast",
      class07045.N(class00032::new, class07428.field_6294)
         .N(4.0F, 4.0F)
         .y(2.6F)
         .N(new class06889(0.0, 4.0, 1.7), new class06889(-1.7, 4.0, 0.0), new class06889(0.0, 4.0, -1.7), new class06889(1.7, 4.0, 0.0))
         .L(0.5F)
         .N(10)
   );
   public static final class07078<class07557> Nz = N("giant", class07045.N(class07557::new, class07428.field_6302).N(3.6F, 12.0F).y(10.44F).L(-3.75F).N(10).R());
   public static final class07078<class02254> NU = N(
      "glow_item_frame", class07045.<class02254>N(class02254::new, class07428.field_17715).i().N(0.5F, 0.5F).y(0.0F).N(10).y(Integer.MAX_VALUE)
   );
   public static final class07078<class05574> NE = N("glow_squid", class07045.N(class05574::new, class07428.field_30092).N(0.8F, 0.8F).y(0.4F).N(10));
   public static final class07078<class02148> NW = N("goat", class07045.N(class02148::new, class07428.field_6294).N(0.9F, 1.3F).N(1.1125F).N(10));
   public static final class07078<class07549> Nm = N(
      "guardian", class07045.N(class07549::new, class07428.field_6302).N(0.85F, 0.85F).y(0.425F).N(0.975F).N(8).R()
   );
   public static final class07078<class06018> NP = N("hoglin", class07045.N(class06018::new, class07428.field_6302).N(1.3964844F, 1.4F).N(1.49375F).N(8));
   public static final class07078<class07514> Ns = N(
      "hopper_minecart", class07045.N(class07514::new, class07428.field_17715).i().N(0.98F, 0.7F).N(0.1875F).N(8)
   );
   public static final class07078<class07901> NT = N(
      "horse", class07045.N(class07901::new, class07428.field_6294).N(1.3964844F, 1.6F).y(1.52F).N(1.44375F).N(10)
   );
   public static final class07078<class07564> Nb = N(
      "husk", class07045.N(class07564::new, class07428.field_6302).N(0.6F, 1.95F).y(1.74F).N(2.075F).L(-0.7F).N(8).R()
   );
   public static final class07078<class07149> Nj = N(
      "illusioner", class07045.N(class07149::new, class07428.field_6302).N(0.6F, 1.95F).N(2.0F).L(-0.6F).N(8).R()
   );
   public static final class07078<class01952> Nv = N("interaction", class07045.N(class01952::new, class07428.field_17715).i().N(0.0F, 0.0F).N(10));
   public static final class07078<class07625> Nn = N("iron_golem", class07045.N(class07625::new, class07428.field_17715).N(1.4F, 2.7F).N(10));
   public static final class07078<class00717> Nt = N(
      "item", class07045.<class00717>N(class00717::new, class07428.field_17715).i().N(0.25F, 0.25F).y(0.2125F).N(6).y(20)
   );
   public static final class07078<class03694> NG = N("item_display", class07045.N(class03694::new, class07428.field_17715).i().N(0.0F, 0.0F).N(10).y(1));
   public static final class07078<class00679> Nl = N(
      "item_frame", class07045.<class00679>N(class00679::new, class07428.field_17715).i().N(0.5F, 0.5F).y(0.0F).N(10).y(Integer.MAX_VALUE)
   );
   public static final class07078<class07487> Nd = N(
      "jungle_boat", class07045.N(N((Supplier<class06581>)(() -> class06570.sl)), class07428.field_17715).i().N(1.375F, 0.5625F).y(0.5625F).N(10)
   );
   public static final class07078<class03976> Nw = N(
      "jungle_chest_boat", class07045.N(u(() -> class06570.sd), class07428.field_17715).i().N(1.375F, 0.5625F).y(0.5625F).N(10)
   );
   public static final class07078<class00700> Nk = N(
      "leash_knot", class07045.<class00700>N(class00700::new, class07428.field_17715).i().y().N(0.375F, 0.5F).y(0.0625F).N(10).y(Integer.MAX_VALUE)
   );
   public static final class07078<class00672> NY = N(
      "lightning_bolt", class07045.N(class00672::new, class07428.field_17715).i().y().N(0.0F, 0.0F).N(16).y(Integer.MAX_VALUE)
   );
   public static final class07078<class00683> NQ = N(
      "llama", class07045.N(class00683::new, class07428.field_6294).N(0.9F, 1.87F).y(1.7765F).N(new class06889(0.0, 1.37, -0.3)).N(10)
   );
   public static final class07078<class08021> NO = N(
      "llama_spit", class07045.<class08021>N(class08021::new, class07428.field_17715).i().N(0.25F, 0.25F).N(4).y(10)
   );
   public static final class07078<class07140> Ng = N(
      "magma_cube", class07045.N(class07140::new, class07428.field_6302).L().N(0.52F, 0.52F).y(0.325F).N(4.0F).N(8).R()
   );
   public static final class07078<class07487> NI = N(
      "mangrove_boat", class07045.N(N((Supplier<class06581>)(() -> class06570.so)), class07428.field_17715).i().N(1.375F, 0.5625F).y(0.5625F).N(10)
   );
   public static final class07078<class03976> NJ = N(
      "mangrove_chest_boat", class07045.N(u(() -> class06570.sq), class07428.field_17715).i().N(1.375F, 0.5625F).y(0.5625F).N(10)
   );
   public static final class07078<class06622> No = N(
      "mannequin", class07045.<class06622>N(class06622::N, class07428.field_17715).N(0.6F, 1.8F).y(1.62F).N(class06600.field_62512).N(32).y(2)
   );
   public static final class07078<class01696> Nq = N("marker", class07045.N(class01696::new, class07428.field_17715).i().N(0.0F, 0.0F).N(0));
   public static final class07078<class07518> NK = N("minecart", class07045.N(class07518::new, class07428.field_17715).i().N(0.98F, 0.7F).N(0.1875F).N(8));
   public static final class07078<class07641> NV = N("mooshroom", class07045.N(class07641::new, class07428.field_6294).N(0.9F, 1.4F).y(1.3F).N(1.36875F).N(10));
   public static final class07078<class07896> Ne = N("mule", class07045.N(class07896::new, class07428.field_6294).N(1.3964844F, 1.6F).y(1.52F).N(1.2125F).N(8));
   public static final class07078<class08157> NH = N(
      "nautilus", class07045.N(class08157::new, class07428.field_6300).N(0.875F, 0.95F).N(1.1375F).y(0.2751F).N(10)
   );
   public static final class07078<class07487> Nc = N(
      "oak_boat", class07045.N(N((Supplier<class06581>)(() -> class06570.sb)), class07428.field_17715).i().N(1.375F, 0.5625F).y(0.5625F).N(10)
   );
   public static final class07078<class03976> NX = N(
      "oak_chest_boat", class07045.N(u(() -> class06570.sj), class07428.field_17715).i().N(1.375F, 0.5625F).y(0.5625F).N(10)
   );
   public static final class07078<class06129> Na = N("ocelot", class07045.N(class06129::new, class07428.field_6294).N(0.6F, 0.7F).N(0.6375F).N(10));
   public static final class07078<class02626> Np = N("ominous_item_spawner", class07045.N(class02626::new, class07428.field_17715).i().N(0.25F, 0.25F).N(8));
   public static final class07078<class00698> NF = N(
      "painting", class07045.<class00698>N(class00698::new, class07428.field_17715).i().N(0.5F, 0.5F).N(10).y(Integer.MAX_VALUE)
   );
   public static final class07078<class07487> NA = N(
      "pale_oak_boat", class07045.N(N((Supplier<class06581>)(() -> class06570.sI)), class07428.field_17715).i().N(1.375F, 0.5625F).y(0.5625F).N(10)
   );
   public static final class07078<class03976> Nf = N(
      "pale_oak_chest_boat", class07045.N(u(() -> class06570.sJ), class07428.field_17715).i().N(1.375F, 0.5625F).y(0.5625F).N(10)
   );
   public static final class07078<class07637> NC = N("panda", class07045.N(class07637::new, class07428.field_6294).N(1.3F, 1.25F).N(10));
   public static final class07078<class06824> NS = N("parched", class07045.N(class06824::new, class07428.field_6302).N(0.6F, 1.99F).y(1.74F).L(-0.7F).N(8).R());
   public static final class07078<class07654> Nx = N("parrot", class07045.N(class07654::new, class07428.field_6294).N(0.5F, 0.9F).y(0.54F).N(0.4625F).N(8));
   public static final class07078<class07155> ND = N(
      "phantom", class07045.N(class07155::new, class07428.field_6302).N(0.9F, 0.5F).y(0.175F).N(0.3375F).L(-0.125F).N(8).R()
   );
   public static final class07078<class07627> Nh = N("pig", class07045.N(class07627::new, class07428.field_6294).N(0.9F, 0.9F).N(0.86875F).N(10));
   public static final class07078<class01489> Nr = N(
      "piglin", class07045.N(class01489::new, class07428.field_6302).N(0.6F, 1.95F).y(1.79F).N(2.0125F).L(-0.7F).N(8)
   );
   public static final class07078<class01266> yN = N(
      "piglin_brute", class07045.N(class01266::new, class07428.field_6302).N(0.6F, 1.95F).y(1.79F).N(2.0125F).L(-0.7F).N(8).R()
   );
   public static final class07078<class07178> yy = N(
      "pillager", class07045.N(class07178::new, class07428.field_6302).u().N(0.6F, 1.95F).N(2.0F).L(-0.6F).N(8).R()
   );
   public static final class07078<class07869> yL = N("polar_bear", class07045.N(class07869::new, class07428.field_6294).N(class00869.ba).N(1.4F, 1.4F).N(10));
   public static final class07078<class08591> yu = N(
      "splash_potion", class07045.<class08591>N(class08591::new, class07428.field_17715).i().N(0.25F, 0.25F).N(4).y(10)
   );
   public static final class07078<class08566> yi = N(
      "lingering_potion", class07045.<class08566>N(class08566::new, class07428.field_17715).i().N(0.25F, 0.25F).N(4).y(10)
   );
   public static final class07078<class07871> yR = N("pufferfish", class07045.N(class07871::new, class07428.field_24460).N(0.7F, 0.7F).y(0.455F).N(4));
   public static final class07078<class07879> yM = N("rabbit", class07045.N(class07879::new, class07428.field_6294).N(0.4F, 0.5F).N(8));
   public static final class07078<class07153> yB = N(
      "ravager", class07045.N(class07153::new, class07428.field_6302).N(1.95F, 2.2F).N(new class06889(0.0, 2.2625, -0.0625)).N(10).R()
   );
   public static final class07078<class07870> yZ = N("salmon", class07045.N(class07870::new, class07428.field_24460).N(0.7F, 0.4F).y(0.26F).N(4));
   public static final class07078<class07881> yz = N("sheep", class07045.N(class07881::new, class07428.field_6294).N(0.9F, 1.3F).y(1.235F).N(1.2375F).N(10));
   public static final class07078<class07144> yU = N("shulker", class07045.N(class07144::new, class07428.field_6302).L().u().N(1.0F, 1.0F).y(0.5F).N(10));
   public static final class07078<class08002> yE = N(
      "shulker_bullet", class07045.<class08002>N(class08002::new, class07428.field_17715).i().N(0.3125F, 0.3125F).N(8)
   );
   public static final class07078<class07147> yW = N(
      "silverfish", class07045.N(class07147::new, class07428.field_6302).N(0.4F, 0.3F).y(0.13F).N(0.2375F).N(8).R()
   );
   public static final class07078<class07146> ym = N("skeleton", class07045.N(class07146::new, class07428.field_6302).N(0.6F, 1.99F).y(1.74F).L(-0.7F).N(8).R());
   public static final class07078<class00682> yP = N(
      "skeleton_horse", class07045.N(class00682::new, class07428.field_6294).N(1.3964844F, 1.6F).y(1.52F).N(1.31875F).N(10)
   );
   public static final class07078<class07162> ys = N("slime", class07045.N(class07162::new, class07428.field_6302).N(0.52F, 0.52F).y(0.325F).N(4.0F).N(10).R());
   public static final class07078<class08029> yT = N(
      "small_fireball", class07045.<class08029>N(class08029::new, class07428.field_17715).i().N(0.3125F, 0.3125F).N(4).y(10)
   );
   public static final class07078<class01964> yb = N(
      "sniffer", class07045.N(class01964::new, class07428.field_6294).N(1.9F, 1.75F).y(1.05F).N(2.09375F).u(2.05F).N(10)
   );
   public static final class07078<class08045> yj = N(
      "snowball", class07045.<class08045>N(class08045::new, class07428.field_17715).i().N(0.25F, 0.25F).N(4).y(10)
   );
   public static final class07078<class07888> yv = N(
      "snow_golem", class07045.N(class07888::new, class07428.field_17715).N(class00869.ba).N(0.7F, 1.9F).y(1.7F).N(8)
   );
   public static final class07078<class07506> yn = N(
      "spawner_minecart", class07045.N(class07506::new, class07428.field_17715).i().N(0.98F, 0.7F).N(0.1875F).N(8)
   );
   public static final class07078<class08016> yt = N(
      "spectral_arrow", class07045.<class08016>N(class08016::new, class07428.field_17715).i().N(0.5F, 0.5F).y(0.13F).N(4).y(20)
   );
   public static final class07078<class07141> yG = N("spider", class07045.N(class07141::new, class07428.field_6302).N(1.4F, 0.9F).y(0.65F).N(0.765F).N(8).R());
   public static final class07078<class07487> yl = N(
      "spruce_boat", class07045.N(N((Supplier<class06581>)(() -> class06570.sv)), class07428.field_17715).i().N(1.375F, 0.5625F).y(0.5625F).N(10)
   );
   public static final class07078<class03976> yd = N(
      "spruce_chest_boat", class07045.N(u(() -> class06570.sn), class07428.field_17715).i().N(1.375F, 0.5625F).y(0.5625F).N(10)
   );
   public static final class07078<class07883> yw = N("squid", class07045.N(class07883::new, class07428.field_6300).N(0.8F, 0.8F).y(0.4F).N(8));
   public static final class07078<class07164> yk = N(
      "stray", class07045.N(class07164::new, class07428.field_6302).N(0.6F, 1.99F).y(1.74F).L(-0.7F).N(class00869.ba).N(8).R()
   );
   public static final class07078<class01377> yY = N("strider", class07045.N(class01377::new, class07428.field_6294).L().N(0.9F, 1.7F).N(10));
   public static final class07078<class04096> yQ = N("tadpole", class07045.N(class04096::new, class07428.field_6294).N(0.4F, 0.3F).y(0.19500001F).N(10));
   public static final class07078<class03677> yO = N("text_display", class07045.N(class03677::new, class07428.field_17715).i().N(0.0F, 0.0F).N(10).y(1));
   public static final class07078<class00674> yg = N(
      "tnt", class07045.<class00674>N(class00674::new, class07428.field_17715).i().L().N(0.98F, 0.98F).y(0.15F).N(10).y(10)
   );
   public static final class07078<class07507> yI = N("tnt_minecart", class07045.N(class07507::new, class07428.field_17715).i().N(0.98F, 0.7F).N(0.1875F).N(8));
   public static final class07078<class06179> yJ = N(
      "trader_llama", class07045.N(class06179::new, class07428.field_6294).N(0.9F, 1.87F).y(1.7765F).N(new class06889(0.0, 1.37, -0.3)).N(10)
   );
   public static final class07078<class07517> yo = N(
      "trident", class07045.<class07517>N(class07517::new, class07428.field_17715).i().N(0.5F, 0.5F).y(0.13F).N(4).y(20)
   );
   public static final class07078<class07899> yq = N("tropical_fish", class07045.N(class07899::new, class07428.field_24460).N(0.5F, 0.4F).y(0.26F).N(4));
   public static final class07078<class07872> yK = N(
      "turtle", class07045.N(class07872::new, class07428.field_6294).N(1.2F, 0.4F).N(new class06889(0.0, 0.55625, -0.25)).N(10)
   );
   public static final class07078<class08042> yV = N(
      "vex", class07045.N(class08042::new, class07428.field_6302).L().N(0.4F, 0.8F).y(0.51875F).N(0.7375F).L(0.04F).N(8).R()
   );
   public static final class07078<class08041> ye = N(
      "villager", class07045.<class08041>N(class08041::new, class07428.field_17715).N(0.6F, 1.95F).y(1.62F).N(10)
   );
   public static final class07078<class08011> yH = N(
      "vindicator", class07045.N(class08011::new, class07428.field_6302).N(0.6F, 1.95F).N(2.0F).L(-0.6F).N(8).R()
   );
   public static final class07078<class06163> yc = N("wandering_trader", class07045.N(class06163::new, class07428.field_6294).N(0.6F, 1.95F).y(1.62F).N(10));
   public static final class07078<class04003> yX = N(
      "warden", class07045.N(class04003::new, class07428.field_6302).N(0.9F, 2.9F).N(3.15F).N(class03831.field_48320, 0.0F, 1.6F, 0.0F).N(16).L().R()
   );
   public static final class07078<class04499> ya = N(
      "wind_charge", class07045.<class04499>N(class04499::new, class07428.field_17715).i().N(0.3125F, 0.3125F).y(0.0F).N(4).y(10)
   );
   public static final class07078<class08047> yp = N("witch", class07045.N(class08047::new, class07428.field_6302).N(0.6F, 1.95F).y(1.62F).N(2.2625F).N(8).R());
   public static final class07078<class00680> yF = N(
      "wither", class07045.N(class00680::new, class07428.field_6302).L().N(class00869.Lm).N(0.9F, 3.5F).N(10).R()
   );
   public static final class07078<class08023> yA = N(
      "wither_skeleton", class07045.N(class08023::new, class07428.field_6302).L().N(class00869.Lm).N(0.7F, 2.4F).y(2.1F).L(-0.875F).N(8).R()
   );
   public static final class07078<class07513> yf = N(
      "wither_skull", class07045.<class07513>N(class07513::new, class07428.field_17715).i().N(0.3125F, 0.3125F).N(4).y(10)
   );
   public static final class07078<class07894> yC = N(
      "wolf", class07045.N(class07894::new, class07428.field_6294).N(0.6F, 0.85F).y(0.68F).N(new class06889(0.0, 0.81875, -0.0625)).N(10)
   );
   public static final class07078<class05292> yS = N(
      "zoglin", class07045.N(class05292::new, class07428.field_6302).L().N(1.3964844F, 1.4F).N(1.49375F).N(8).R()
   );
   public static final class07078<class08004> yx = N(
      "zombie", class07045.<class08004>N(class08004::new, class07428.field_6302).N(0.6F, 1.95F).y(1.74F).N(2.0125F).L(-0.7F).N(8).R()
   );
   public static final class07078<class00673> yD = N(
      "zombie_horse", class07045.N(class00673::new, class07428.field_6302).N(1.3964844F, 1.6F).y(1.52F).N(1.31875F).N(10)
   );
   public static final class07078<class08187> yh = N(
      "zombie_nautilus", class07045.N(class08187::new, class07428.field_6302).N(0.875F, 0.95F).N(1.1375F).y(0.2751F).N(10)
   );
   public static final class07078<class08018> yr = N(
      "zombie_villager", class07045.N(class08018::new, class07428.field_6302).N(0.6F, 1.95F).N(2.125F).L(-0.7F).y(1.74F).N(8).R()
   );
   public static final class07078<class07182> LN = N(
      "zombified_piglin", class07045.N(class07182::new, class07428.field_6302).L().N(0.6F, 1.95F).y(1.79F).N(2.0F).L(-0.7F).N(8).R()
   );
   public static final class07078<class08036> Ly = N(
      "player", class07045.<class08036>N(class07428.field_17715).y().N().N(0.6F, 1.8F).y(1.62F).N(class06600.field_62512).N(32).y(2)
   );
   public static final class07078<class00696> LL = N(
      "fishing_bobber", class07045.<class00696>N(class00696::new, class07428.field_17715).i().y().N().N(0.25F, 0.25F).N(4).y(5)
   );
   private static final Set<class07078<?>> Lz = Set.of(Ny, I, yn);
   private final class07040<T> LU;
   private final class07428 LE;
   private final ImmutableSet<class00891> LW;
   private final boolean Lm;
   private final boolean LP;
   private final boolean Ls;
   private final boolean LT;
   private final int Lb;
   private final int Lj;
   private final String Lv;
   @Nullable
   private class00392 Ln;
   private final Optional<class05946<class05074>> Lt;
   public class01325 Lu;
   private final float LG;
   private final class03767 Ll;
   private final boolean Ld;
   @Nullable
   private Boolean Lw;
   @Nullable
   private Boolean Lk;

   private static class07040<class00267> L(Supplier<class06581> var0) {
      return (var1, var2) -> new class00267(var1, var2, var0);
   }

   public boolean L() {
      return this.Ls;
   }

   public class00392 M() {
      if (this.Ln == null) {
         this.Ln = class00392.L(this.R());
      }

      return this.Ln;
   }

   public boolean P() {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(callbackinforeturnable);
      return callbackinforeturnable.isCancelled()
         ? callbackinforeturnable.getReturnValueZ()
         : this != Ly && this != NO && this != yF && this != W && this != Nl && this != NU && this != Nk && this != NF && this != S && this != D;
   }

   @Deprecated
   public class03529<class07078<?>> T() {
      return this.LM;
   }

   public class07078(
      class07040<T> var1,
      class07428 var2,
      boolean var3,
      boolean var4,
      boolean var5,
      boolean var6,
      ImmutableSet<class00891> var7,
      class01325 var8,
      float var9,
      int var10,
      int var11,
      String var12,
      Optional<class05946<class05074>> var13,
      class03767 var14,
      boolean var15
   ) {
      super();
      this.LU = var1;
      this.LE = var2;
      this.LT = var6;
      this.Lm = var3;
      this.LP = var4;
      this.Ls = var5;
      this.LW = var7;
      this.Lu = var8;
      this.LG = var9;
      this.Lb = var10;
      this.Lj = var11;
      this.Lv = var12;
      this.Lt = var13;
      this.Ll = var14;
      this.Ld = var15;
   }

   @Override
   public String toString() {
      return this.R();
   }

   public String B() {
      int ix = this.R().lastIndexOf(46);
      return ix == -1 ? this.R() : this.R().substring(ix + 1);
   }

   public Optional<class05946<class05074>> Z() {
      return this.Lt;
   }

   public class07428 i() {
      return this.LE;
   }

   public boolean b() {
      return this.Ld;
   }

   @Override
   public Class<? extends class07049> s() {
      return class07049.class;
   }

   public int m() {
      return this.Lj;
   }

   public boolean j() {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.y(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueZ() : Lz.contains(this);
   }

   public float U() {
      return this.Lu.y();
   }

   public float z() {
      return this.Lu.N();
   }

   private static class07040<class00259> u(Supplier<class06581> var0) {
      return (var1, var2) -> new class00259(var1, var2, var0);
   }

   public boolean u() {
      return this.LT;
   }

   public static <T extends class07049> Consumer<T> y(Consumer<T> var0, class07299 var1, class06584 var2, @Nullable class07438 var3) {
      class08983 class08983 = var2.method_58694(class02484.NR);
      return class08983 != null ? var0.andThen(var3x -> N(var1, var3, var3x, class08983)) : var0;
   }

   private static class05946<class07078<?>> y(String var0) {
      return class05946.N(class04227.I, class01894.y(var0));
   }

   private static class07040<class03976> y(Supplier<class06581> var0) {
      return (var1, var2) -> new class03976(var1, var2, var0);
   }

   public void y(CallbackInfoReturnable var1) {
      if (this.Lk != null) {
         var1.setReturnValue(this.Lk);
      }
   }

   @Nullable
   public T y(class04782 var1, @Nullable Consumer<T> var2, class07209 var3, class06113 var4, boolean var5, boolean var6) {
      class07049 class07049 = this.N(var1, var4);
      if (class07049 == null) {
         return null;
      } else {
         double d0;
         if (var5) {
            class07049.method_5814(var3.method_10263() + 0.5, var3.method_10264() + 1, var3.method_10260() + 0.5);
            d0 = N(var1, var3, var6, class07049.method_5829());
         } else {
            d0 = 0.0;
         }

         class07049.method_5808(
            var3.method_10263() + 0.5, var3.method_10264() + d0, var3.method_10260() + 0.5, class04995.R(var1.field_9229.z() * 360.0F), 0.0F
         );
         if (class07049 instanceof class07079 class07079) {
            class07079.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = class07079.method_36454();
            class07079.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = class07079.method_36454();
            class07079.N(var1, var1.method_8404(class07079.method_24515()), var4, null);
         }

         if (var2 != null) {
            var2.accept(class07049);
         }

         return (T)class07049;
      }
   }

   public boolean y() {
      return this.LP;
   }

   private static Optional<class07049> y(class08299 var0, class07299 var1, class06113 var2) {
      try {
         return N(var0, var1, var2);
      } catch (RuntimeException runtimeexception) {
         LR.warn("Exception loading entity: ", runtimeexception);
         return Optional.empty();
      }
   }

   private static Optional<class07049> y(class07078<?> var0, class08299 var1, class07299 var2, class06113 var3) {
      try {
         return N(var0, var1, var2, var3);
      } catch (RuntimeException runtimeexception) {
         LR.warn("Exception loading entity: ", runtimeexception);
         return Optional.empty();
      }
   }

   public class01325 E() {
      return this.Lu;
   }

   public void N(CallbackInfoReturnable var1) {
      if (this.Lw != null) {
         var1.setReturnValue(this.Lw);
      }
   }

   public boolean N() {
      return this.Lm;
   }

   public static void N(class07299 var0, @Nullable class07438 var1, @Nullable class07049 var2, class08983<class07078<?>> var3) {
      class02796 class02796 = var0.method_8503();
      if (class02796 != null && var2 != null) {
         if (var2.method_5864() == var3.N()) {
            if (var0.method_8608() || !var2.method_5864().j() || var1 instanceof class08036 class08036 && class02796.Nm().R(class08036.method_72498())) {
               var3.N(var2);
            }
         }
      }
   }

   protected static double N(class05487 var0, class07209 var1, boolean var2, class00734 var3) {
      class00734 class00734 = new class00734(var1);
      if (var2) {
         class00734 = class00734.y(0.0, -1.0, 0.0);
      }

      Iterable iterable = var0.method_8600(null, class00734);
      return 1.0 + class00389.N(class07185.field_11052, var3, iterable, var2 ? -2.0 : -1.0);
   }

   @Nullable
   public T N(class04782 var1, @Nullable Consumer<T> var2, class07209 var3, class06113 var4, boolean var5, boolean var6) {
      class07049 class07049 = this.y(var1, var2, var3, var4, var5, var6);
      if (class07049 != null) {
         var1.y(class07049);
         if (class07049 instanceof class07079) {
            ((class07079)class07049).D();
         }
      }

      return (T)class07049;
   }

   public class00734 N(double var1, double var3, double var5) {
      float fx = this.LG * this.z() / 2.0F;
      float f1 = this.LG * this.U();
      return new class00734(var1 - fx, var3, var5 - fx, var1 + fx, var3 + f1, var5 + fx);
   }

   public static Optional<class07049> N(class07078<?> var0, class08299 var1, class07299 var2, class06113 var3) {
      Optional optional = Optional.ofNullable(var0.N(var2, var3));
      optional.ifPresent(var1x -> var1x.method_5651(var1));
      return optional;
   }

   public static Optional<class07049> N(class08299 var0, class07299 var1, class06113 var2) {
      return class07536.N(
         N(var0).map(var2x -> var2x.N(var1, var2)), var1x -> var1x.method_5651(var0), () -> LR.warn("Skipping Entity with id {}", var0.N("id", "[invalid]"))
      );
   }

   @Nullable
   public T N(class07299 var1, class06113 var2) {
      return !this.N(var1.method_45162()) ? null : this.LU.create(this, var1);
   }

   @Nullable
   public T N(class04782 var1, @Nullable class06584 var2, @Nullable class07438 var3, class07209 var4, class06113 var5, boolean var6, boolean var7) {
      Consumer consumer;
      if (var2 != null) {
         consumer = N(var1, var2, var3);
      } else {
         consumer = var0 -> {};
      }

      return this.N(var1, consumer, var4, var5, var6, var7);
   }

   public static Optional<class07078<?>> N(String var0) {
      return class04206.M.y(class01894.L(var0));
   }

   public static class01894 N(class07078<?> var0) {
      return class04206.M.y(var0);
   }

   private static <T extends class07049> class07078<T> N(String var0, class07045<T> var1) {
      return N(y(var0), var1);
   }

   @Nullable
   public T N(class04782 var1, class07209 var2, class06113 var3) {
      return this.N(var1, null, var2, var3, false, false);
   }

   public static <T extends class07049> Consumer<T> N(Consumer<T> var0, class06584 var1) {
      return var0.andThen(var1x -> var1x.method_66652(var1));
   }

   public static <T extends class07049> Consumer<T> N(Consumer<T> var0, class07299 var1, class06584 var2, @Nullable class07438 var3) {
      return y(N(var0, var2), var1, var2, var3);
   }

   public static <T extends class07049> Consumer<T> N(class07299 var0, class06584 var1, @Nullable class07438 var2) {
      return N(var0x -> {}, var0, var1, var2);
   }

   public boolean N(class03543<class07078<?>> var1) {
      return var1.N(this.LM);
   }

   public boolean N(class03530<class07078<?>> var1) {
      return this.LM.N(var1);
   }

   public static Stream<class07049> N(class08319 var0, class07299 var1, class06113 var2) {
      return var0.y().mapMulti((var2x, var3) -> N(var2x, var1, var2, var1xx -> {
         var3.accept(var1xx);
         return var1xx;
      }));
   }

   private static class07049 N(class07049 var0, class08299 var1, class07299 var2, class06113 var3, class06837 var4) {
      Iterator iterator = var1.u("Passengers").iterator();

      while (iterator.hasNext()) {
         class07049 class07049 = N((class08299)iterator.next(), var2, var3, var4);
         if (class07049 != null) {
            class07049.method_5873(var0, true, false);
         }
      }

      return var0;
   }

   @Nullable
   public static class07049 N(class07078<?> var0, class08299 var1, class07299 var2, class06113 var3, class06837 var4) {
      return y(var0, var1, var2, var3).map(var4::process).map(var4x -> N(var4x, var1, var2, var3, var4)).orElse(null);
   }

   private static class07040<class07487> N(Supplier<class06581> var0) {
      return (var1, var2) -> new class07487(var1, var2, var0);
   }

   private static <T extends class07049> class07078<T> N(class05946<class07078<?>> var0, class07045<T> var1) {
      return class00751.N(class04206.M, var0, var1.N(var0));
   }

   @Nullable
   public T N(class07049 var1) {
      return (T)(var1.method_5864() == this ? var1 : null);
   }

   @Nullable
   public static class07049 N(class07078<?> var0, class07001 var1, class07299 var2, class06113 var3, class06837 var4) {
      class07049 class07049;
      try (class04495 class04495 = new class04495(LR)) {
         class07049 = N(var0, class08308.N(class04495, var2.method_30349(), var1), var2, var3, var4);
      }

      return class07049;
   }

   public static Optional<class07078<?>> N(class08299 var0) {
      return var0.N("id", N);
   }

   public boolean N(class00500 var1) {
      if (this.LW.contains(var1.i())) {
         return false;
      } else {
         return !this.Ls && class02119.N(var1) ? true : var1.N(class00869.Lm) || var1.N(class00869.sM) || var1.N(class00869.ij) || var1.N(class00869.ba);
      }
   }

   @Nullable
   public static class07049 N(class08299 var0, class07299 var1, class06113 var2, class06837 var3) {
      return y(var0, var1, var2).map(var3::process).map(var4 -> N(var4, var0, var1, var2, var3)).orElse(null);
   }

   @Nullable
   public static class07049 N(class07001 var0, class07299 var1, class06113 var2, class06837 var3) {
      class07049 class07049;
      try (class04495 class04495 = new class04495(LR)) {
         class07049 = N(class08308.N(class04495, var1.method_30349(), var0), var1, var2, var3);
      }

      return class07049;
   }

   public int W() {
      return this.Lb;
   }

   public String R() {
      return this.Lv;
   }

   @Override
   public class03767 method_45322() {
      return this.Ll;
   }

   public void fabric_setCanPotentiallyExecuteCommands(@Nullable Boolean var1) {
      this.Lk = var1;
   }

   public void fabric_setAlwaysUpdateVelocity(@Nullable Boolean var1) {
      this.Lw = var1;
   }
}
