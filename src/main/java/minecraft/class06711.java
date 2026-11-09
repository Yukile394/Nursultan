package minecraft;

import Nursultan.class10646;
import Nursultan.class10654;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Reference2FloatMap;
import it.unimi.dsi.fastutil.objects.Reference2FloatMaps;
import it.unimi.dsi.fastutil.objects.Reference2FloatOpenHashMap;
import java.nio.file.Path;
import java.util.Set;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class class06711 implements AutoCloseable {
   static final Logger N = LogUtils.getLogger();
   private static final ThreadFactory l = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String d = "new_";
   public static final class00392 y = class00392.L("optimizeWorld.stage.upgrading.poi");
   public static final class00392 L = class00392.L("optimizeWorld.stage.finished.poi");
   public static final class00392 u = class00392.L("optimizeWorld.stage.upgrading.entities");
   public static final class00392 i = class00392.L("optimizeWorld.stage.finished.entities");
   static final class00392 R = class00392.L("optimizeWorld.stage.upgrading.chunks");
   static final class00392 M = class00392.L("optimizeWorld.stage.finished.chunks");
   final class00751<class01255> B;
   final Set<class05946<class07299>> Z;
   final boolean z;
   final boolean U;
   final class04785 E;
   private final Thread w;
   final DataFixer W;
   volatile boolean m = true;
   private volatile boolean k;
   volatile float P;
   volatile int s;
   volatile int T;
   volatile int b;
   volatile int j;
   final Reference2FloatMap<class05946<class07299>> v = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile class00392 n = class00392.L("optimizeWorld.stage.counting");
   static final Pattern t = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final class00408 G;

   public Set<class05946<class07299>> L() {
      return this.Z;
   }

   public int M() {
      return this.j;
   }

   public class06711(class04785 var1, DataFixer var2, class05081 var3, class01042 var4, boolean var5, boolean var6) {
      super();
      this.B = var4.L(class04227.yI);
      this.Z = this.B.B().stream().map(class04227::N).collect(Collectors.toUnmodifiableSet());
      this.z = var5;
      this.W = var2;
      this.E = var1;
      this.G = new class00408(this.E.N(class07299.field_25179).resolve("data"), var2, var4);
      this.U = var6;
      this.w = l.newThread(this::Z);
      this.w.setUncaughtExceptionHandler((var1x, var2x) -> {
         N.error("Error upgrading world", var2x);
         this.n = class00392.L("optimizeWorld.stage.failed");
         this.k = true;
      });
      this.w.start();
   }

   public class00392 B() {
      return this.n;
   }

   private void Z() {
      long ix = class07536.L();
      N.info("Upgrading entities");
      new class10646(this).N();
      N.info("Upgrading POIs");
      new class10654(this).N();
      N.info("Upgrading blocks");
      new class06696(this).N();
      this.G.y();
      ix = class07536.L() - ix;
      N.info("World optimizaton finished after {} seconds", ix / 1000L);
      this.k = true;
   }

   public int i() {
      return this.s;
   }

   @Override
   public void close() {
      this.G.close();
   }

   public float u() {
      return this.P;
   }

   public boolean y() {
      return this.k;
   }

   public void N() {
      this.m = false;

      try {
         this.w.join();
      } catch (InterruptedException interruptedexception) {
      }
   }

   public float N(class05946<class07299> var1) {
      return this.v.getFloat(var1);
   }

   static Path N(Path var0) {
      return var0.resolveSibling("new_" + var0.getFileName().toString());
   }

   public int R() {
      return this.b;
   }
}
