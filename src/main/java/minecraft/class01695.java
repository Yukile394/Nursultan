package minecraft;

import Nursultan.class09512;
import com.google.common.base.Stopwatch;
import com.mojang.authlib.yggdrasil.ServicesKeySet;
import com.mojang.brigadier.StringReader;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.BooleanSupplier;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;
import net.fabricmc.fabric.impl.resource.pack.ModPackResourcesUtil;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01695 extends class02796 {
   private static final Logger N = LogUtils.getLogger();
   private static final int W = 20;
   private static final int m = 14999992;
   private static final class03930 P = new class03930(null, ServicesKeySet.EMPTY, null, new class01691(), new class01682());
   private static final class03767 s = class03794.i.N().u(class03767.N(class03794.L, class03794.u));
   private final class02270 T = new class02270(4);
   private final Optional<String> b;
   private final boolean j;
   private List<class05531> v = new ArrayList<>();
   private final Stopwatch n = Stopwatch.createUnstarted();
   private static final class05934 t = new class05934(0L, false, false);
   @Nullable
   private class05494 G;

   @Override
   public boolean M() {
      return false;
   }

   @Override
   public boolean P() {
      return false;
   }

   @Override
   public class06984 T() {
      return class06984.N;
   }

   private class01695(Thread var1, class04785 var2, class01623 var3, class03531 var4, Optional<String> var5, boolean var6) {
      super(var1, var2, var3, var4, Proxy.NO_PROXY, class04999.N(), P, class08759.N());
      this.b = var5;
      this.j = var6;
   }

   @Override
   public boolean B() {
      return false;
   }

   private boolean e() {
      return this.G != null;
   }

   @Override
   public class01675 l() {
      return this.T;
   }

   @Override
   public class08152 d() {
      return class06984.i;
   }

   @Override
   public int t() {
      return 1;
   }

   @Override
   public int U() {
      return 0;
   }

   @Override
   public boolean z() {
      return false;
   }

   private void y(class04782 var1) {
      class07209 class07209 = new class07209(var1.field_9229.N(-14999992, 14999992), -59, var1.field_9229.N(-14999992, 14999992));
      var1.method_27873(class05042.N(var1.method_27983(), class07209, 0.0F, 0.0F));
      class05520 class05520 = class05500.N(this.v, var1).N((class05516)(new class04270(class07209, 8, false))).L();
      List<class05513> list = class05520.N();
      this.G = new class05494(list);
      N.info("{} tests are now running at position {}!", this.G.B(), class07209.method_23854());
      this.n.reset();
      this.n.start();
      class05520.y();
   }

   @Override
   public boolean E() {
      return false;
   }

   @Override
   public boolean N(class08774 var1) {
      return false;
   }

   private static Stream<class05513> N(class03529<class00201> var0, class04782 var1) {
      Builder builder = Stream.builder();

      for (class06993 class06993 : class06993.values()) {
         for (int i = 0; i < 100; i++) {
            builder.add(new class05513(var0, class06993, var1, class04272.N()));
         }
      }

      return builder.build();
   }

   public static Stream<class03529<class00201>> N(class01042 var0, String var1) {
      return class00202.N(new StringReader(var1), var0.L(class04227.yt)).stream();
   }

   @Override
   public void N(BooleanSupplier var1) {
      super.N(var1);
      class04782 class04782 = this.NY();
      if (!this.e()) {
         this.y(class04782);
      }

      if (class04782.N() % 20L == 0L) {
         N.info(this.G.z());
      }

      if (this.G.Z()) {
         this.y(false);
         N.info(this.G.z());
         class04833.N();
         N.info("========= {} GAME TESTS COMPLETE IN {} ======================", this.G.B(), this.n.stop());
         if (this.G.u()) {
            N.info("{} required tests failed :(", this.G.N());
            this.G.R().forEach(class01695::N);
         } else {
            N.info("All {} required tests passed :)", this.G.B());
         }

         if (this.G.i()) {
            N.info("{} optional tests failed", this.G.y());
            this.G.M().forEach(class01695::N);
         }

         N.info("====================================================");
      }
   }

   private static void N(class05513 var0) {
      if (var0.n() != class06993.field_11467) {
         N.info("   - {} with rotation {}: {}", new Object[]{var0.y(), var0.n().method_15434(), var0.m().N().getString()});
      } else {
         N.info("   - {}: {}", var0.y(), var0.m().N().getString());
      }
   }

   private List<class05531> N(class04782 var1) {
      class00751 class00751 = var1.method_30349().L(class04227.yt);
      List<class03529<class00201>> list;
      class04274 class04274;
      if (this.b.isPresent()) {
         list = N(var1.method_30349(), this.b.get()).filter(var0 -> !var0.N().Z()).toList();
         if (this.j) {
            class04274 = class01695::N;
            N.info("Verify requested. Will run each test that matches {} {} times", this.b.get(), 100 * class06993.values().length);
         } else {
            class04274 = class04265.N;
            N.info("Will run tests matching {} ({} tests)", this.b.get(), list.size());
         }
      } else {
         list = class00751.z().filter(var0 -> !var0.N().Z()).toList();
         class04274 = class04265.N;
      }

      return class04265.N(list, class04274, var1);
   }

   @Override
   public boolean N() {
      this.N(new class09512(this, this, this.yG(), this.Z, new class07408()));
      class06724.N(class06728.y);
      this.NP();
      class04782 class04782 = this.NY();
      this.v = this.N(class04782);
      N.info("Started game test server");
      return true;
   }

   public static class01695 N(Thread var0, class04785 var1, class01623 var2, Optional<String> var3, boolean var4) {
      var2.N();
      ArrayList arraylist = new ArrayList<>(var2.L());
      arraylist.remove("vanilla");
      arraylist.addFirst("vanilla");
      class03776 class03776 = new class03776(class01247, s);
      class01247 class01247 = N(arraylist, List.of());
      if (class01247 == null) {
         throw new NullPointerException(
            "@Redirect constructor handler net/minecraft/class_6306::replaceDefaultDataPackSettings returned null for net.minecraft.class_5359"
         );
      } else {
         class03776 class03776x = class03776;
         class07312 class07312 = new class07312("Test Level", class07282.field_9220, false, class07086.field_5802, true, new class07305(s), class03776x);
         class01898 class01898 = new class01898(var2, class03776x, false, true);
         class01908 class01908 = new class01908(class01898, class07671.field_25420, class06984.i);

         try {
            N.debug("Starting resource loading");
            Stopwatch stopwatch = Stopwatch.createStarted();
            class03531 class03531 = class07536.<class03531>L(var2x -> class01897.N(class01908, var1xx -> {
               class00751 class00751 = new class00731<>(class04227.yI, Lifecycle.stable()).W();
               class03781 class03781 = var1xx.L().y(class04227.yO).y(class05964.y).N().N().N(class00751);
               return new class03981<>(new class06207(class07312, t, class03781.u(), class03781.N()), class03781.y());
            }, class03531::new, class07536.B(), var2x)).get();
            stopwatch.stop();
            N.debug("Finished resource loading after {} ms", stopwatch.elapsed(TimeUnit.MILLISECONDS));
            return new class01695(var0, var1, var2, class03531, var3, var4);
         } catch (Exception exception) {
            N.warn("Failed to load vanilla datapack, bit oops", exception);
            System.exit(-1);
            throw new IllegalStateException();
         }
      }
   }

   @Override
   public void N(class07080 var1) {
      super.N(var1);
      N.error("Game test server crashed\n{}", var1.N(class02587.N));
      System.exit(1);
   }

   private static class01247 N(List var0, List var1) {
      return ModPackResourcesUtil.createTestServerSettings(var0, var1);
   }

   @Override
   public class03463 N(class03463 var1) {
      var1.N("Type", "Game test server");
      return var1;
   }

   @Override
   public boolean ao_() {
      return false;
   }

   @Override
   public boolean R() {
      return false;
   }

   @Override
   public void H() {
      super.H();
      N.info("Game test server shutting down");
      System.exit(this.G != null ? this.G.N() : -1);
   }

   @Override
   public void y_() {
      this.g();
   }
}
