package minecraft;

import Nursultan.class10523;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.common.net.HostAndPort;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import io.netty.handler.ssl.SslContext;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05623 extends class02796 implements class04243 {
   public static final Logger N = LogUtils.getLogger();
   private static final int W = 5000;
   private static final int m = 2;
   private final List<class03656> P = Collections.synchronizedList(Lists.newArrayList());
   @Nullable
   private class05178 s;
   private final class05147 T;
   @Nullable
   private class04903 b;
   private final class05279 j;
   @Nullable
   private class05589 v;
   @Nullable
   private final class02593 n;
   @Nullable
   private class02292 t;
   private boolean G;
   private final class02243 l;
   private final Map<String, String> d;
   @Nullable
   private class07911 w;
   private long k;

   @Override
   public void L(boolean var1) {
      this.j.N(var2 -> (class05270)var2.W.N(this.yt(), var1));
   }

   public void L(int var1) {
      this.j.N(var2 -> (class05270)var2.X.N(this.yt(), var1));
      this.Nm().y(var1);
   }

   @Override
   public String L() {
      return this.Nb();
   }

   public void M(int var1) {
      this.j.N(var2 -> (class05270)var2.NR.N(this.yt(), var1));
   }

   @Override
   public boolean M() {
      return this.y().F;
   }

   public void M(boolean var1) {
      this.j.N(var2 -> (class05270)var2.h.N(this.yt(), var1));
   }

   @Override
   public boolean P() {
      return true;
   }

   @Override
   public void X() {
      while (!this.P.isEmpty()) {
         class03656 class03656 = this.P.remove(0);
         this.yL().N(class03656.y, class03656.N);
      }
   }

   @Override
   public void K() {
      this.N((class07086)this.y().m.get(), true);
   }

   @Override
   public class06984 T() {
      return (class06984)this.y().q.get();
   }

   public class05623(Thread var1, class04785 var2, class01623 var3, class03531 var4, class05279 var5, DataFixer var6, class03930 var7) {
      super(var1, var2, var3, var4, Proxy.NO_PROXY, var6, var7, class08759.N());
      this.j = var5;
      this.T = new class05147(this);
      this.n = class02593.N(var5.N());
      this.l = N(var5);
      if (var5.N().z) {
         this.d = ye();
      } else {
         this.d = Map.of();
      }
   }

   public void B(int var1) {
      this.j.N(var2 -> (class05270)var2.r.N(this.yt(), var1));
   }

   @Override
   public boolean B() {
      return this.y().A;
   }

   public void B(boolean var1) {
      this.j.N(var2 -> (class05270)var2.E.N(this.yt(), var1));
      this.L(this.v());
   }

   @Override
   public int C() {
      return (Integer)this.j.N().Ni.get();
   }

   @Override
   public int D() {
      return this.y().f;
   }

   public int F() {
      return (Integer)this.y().o.get();
   }

   public int S() {
      return (Integer)this.j.N().NR.get();
   }

   public void Z(int var1) {
      this.j.N(var2 -> (class05270)var2.Nz.N(this.yt(), var1));
   }

   public void Z(boolean var1) {
      this.j.N(var2 -> (class05270)var2.NE.N(this.yt(), var1));
   }

   public int V() {
      return (Integer)this.j.N().c.get();
   }

   public int e() {
      return (Integer)this.j.N().X.get();
   }

   @Override
   public String i() {
      return this.x();
   }

   public void i(int var1) {
      this.j.N(var2 -> (class05270)var2.o.N(this.yt(), var1));
   }

   public void i(boolean var1) {
      this.j.N(var2 -> (class05270)var2.B.N(this.yt(), var1));
   }

   @Override
   public String x() {
      return (String)this.j.N().Z.get();
   }

   @Override
   public String s() {
      return "";
   }

   @Override
   public void c() {
      super.c();
      this.X();
   }

   @Override
   public int h() {
      return this.y().p;
   }

   @Override
   public boolean f() {
      return (Boolean)this.y().h.get();
   }

   @Override
   public class01675 l() {
      return this.t;
   }

   @Override
   public class08152 d() {
      return this.y().K;
   }

   @Override
   public void m() {
      this.Nt().y();
      super.m();
      class07536.U();
   }

   @Override
   public void p() {
      if (this.v == null) {
         this.v = class05589.N(this);
      }
   }

   @Override
   public int t() {
      return (Integer)this.j.N().a.get();
   }

   @Nullable
   @Override
   public class07282 v() {
      return this.NR() ? this.E.z() : null;
   }

   @Override
   public boolean j() {
      return this.j.N().C;
   }

   @Override
   public boolean q() {
      return (Boolean)this.j.N().B.get();
   }

   @Override
   public int U() {
      return this.y().H;
   }

   @Override
   public boolean z() {
      return true;
   }

   public void u(int var1) {
      this.j.N(var2 -> (class05270)var2.a.N(this.yt(), var1));
   }

   @Override
   public void u(boolean var1) {
      this.j.N(var2 -> (class05270)var2.NM.N(this.yt(), var1));
   }

   @Override
   public int u() {
      return this.ar_();
   }

   @Override
   public boolean r() {
      class05270 class05270 = this.y();
      return class05270.NB && class05270.i && this.U.y();
   }

   public void y(class07282 var1) {
      this.j.N(var2 -> (class05270)var2.P.N(this.yt(), var1));
      this.E.N(this.NM());
      this.L(this.v());
   }

   public void y(int var1) {
      this.j.N(var2 -> (class05270)var2.c.N(this.yt(), var1));
      this.Nm().N(var1);
   }

   @Override
   public boolean y(boolean var1, boolean var2, boolean var3) {
      this.Nt().L();
      boolean flag = super.y(var1, var2, var3);
      this.Nt().u();
      return flag;
   }

   @Override
   public class05270 y() {
      return this.j.N();
   }

   @Override
   public void y(String var1) {
      this.j.N(var2 -> (class05270)var2.Z.N(this.yt(), var1));
   }

   @Override
   public boolean E() {
      return this.y().J;
   }

   @Override
   public boolean A() {
      return (Boolean)this.y().D.get();
   }

   @Override
   public boolean N() throws IOException {
      int i = this.y().v;
      if (this.y().b) {
         String sx = this.j.N().n;
         if (!class00456.N(sx)) {
            throw new IllegalStateException("Invalid management server secret, must be 40 alphanumeric characters");
         }

         String s1 = this.y().j;
         HostAndPort hostandport = HostAndPort.fromParts(s1, i);
         class00456 class00456 = new class00456(sx);
         String s2 = this.y().d;
         class00448 class00448 = new class00448(class00456, s2);
         N.info("Starting json RPC server on {}", hostandport);
         this.w = new class07911(hostandport, class00448);
         class07393 class07393 = class07393.N(this);
         class07393.B().N(new class07910(class07393, this.w));
         if (this.y().t) {
            SslContext sslcontext = this.yH();
            this.w.N(class07393, sslcontext);
         } else {
            this.w.N(class07393);
         }
      }

      class10523 class10523 = new class10523(this, "Server console handler");
      class10523.setDaemon(true);
      class10523.setUncaughtExceptionHandler(new class07980(N));
      class10523.start();
      N.info("Starting minecraft server version {}", class07529.y().comp_4025());
      if (Runtime.getRuntime().maxMemory() / 1024L / 1024L < 512L) {
         N.warn("To start the server with more ram, launch it as \"java -Xmx1024M -Xms1024M -jar minecraft_server.jar\"");
      }

      N.info("Loading properties");
      class05270 class05270 = this.j.N();
      if (this.No()) {
         this.L("127.0.0.1");
      } else {
         this.E(class05270.i);
         this.W(class05270.R);
         this.L(class05270.M);
      }

      this.E.N((class07282)class05270.P.get());
      N.info("Default game type: {}", class05270.P.get());
      InetAddress inetaddress = null;
      if (!this.Nb().isEmpty()) {
         inetaddress = InetAddress.getByName(this.Nb());
      }

      if (this.ar_() < 0) {
         this.U(class05270.T);
      }

      this.Nq();
      N.info("Starting Minecraft server on {}:{}", this.Nb().isEmpty() ? "*" : this.Nb(), this.ar_());

      try {
         this.Na().N(inetaddress, this.ar_());
      } catch (IOException ioexception) {
         N.warn("**** FAILED TO BIND TO PORT!");
         N.warn("The exception was: {}", ioexception.toString());
         N.warn("Perhaps a server is already running on that port?");
         return false;
      }

      if (!this.NH()) {
         N.warn("**** SERVER IS RUNNING IN OFFLINE/INSECURE MODE!");
         N.warn("The server will make no attempt to authenticate usernames. Beware.");
         N.warn(
            "While this makes the game possible to play without internet access, it also opens up the ability for hackers to connect with any username they choose."
         );
         N.warn("To change this, set \"online-mode\" to \"true\" in the server.properties file.");
      }

      if (this.Ny()) {
         this.U.R().N();
      }

      if (!class01067.i(this)) {
         return false;
      } else {
         this.N(new class05607(this, this.yG(), this.Z));
         this.t = new class02292(class02869.values().length, this.yV(), class02303.field_48817);
         long jx = class07536.u();
         this.U.R().N(!this.NH());
         N.info("Preparing level \"{}\"", this.W());
         this.NP();
         long kx = class07536.u() - jx;
         String s3 = String.format(Locale.ROOT, "%.3fs", kx / 1.0E9);
         N.info("Done ({})! For help, type \"help\"", s3);
         if (class05270.w != null) {
            this.E.m().N(class07305.A, class05270.w, this);
         }

         if (class05270.k) {
            N.info("Starting GS4 status listener");
            this.s = class05178.N(this);
         }

         if (class05270.Q) {
            N.info("Starting remote control listener");
            this.b = class04903.N(this);
         }

         if (this.NL() > 0L) {
            Thread thread = new Thread(new class05615(this));
            thread.setUncaughtExceptionHandler(new class07640(N));
            thread.setName("Server Watchdog");
            thread.setDaemon(true);
            thread.start();
         }

         if (class05270.x) {
            class05084.N(this);
            N.info("JMX monitoring enabled");
         }

         this.Nt().N();
         return true;
      }
   }

   private static Optional<URI> N(class05270 var0) {
      String sx = var0.U;
      if (sx.isEmpty()) {
         return Optional.empty();
      } else {
         try {
            return Optional.of(class07536.N(sx));
         } catch (Exception exception) {
            N.warn("Failed to parse bug link {}", sx, exception);
            return Optional.empty();
         }
      }
   }

   private static class02243 N(class05279 var0) {
      return N(var0.N()).map(var0x -> new class02243(List.of(class02222.field_51981.N(var0x)))).orElse(class02243.N);
   }

   @Override
   public int N(int var1) {
      return this.Ni() * var1 / 100;
   }

   @Override
   public void N(Path var1) throws IOException {
      class05270 class05270 = this.y();

      try (BufferedWriter bufferedwriter = Files.newBufferedWriter(var1)) {
         bufferedwriter.write(String.format(Locale.ROOT, "sync-chunk-writes=%s%n", class05270.C));
         bufferedwriter.write(String.format(Locale.ROOT, "gamemode=%s%n", class05270.P.get()));
         bufferedwriter.write(String.format(Locale.ROOT, "entity-broadcast-range-percentage=%d%n", class05270.r.get()));
         bufferedwriter.write(String.format(Locale.ROOT, "max-world-size=%d%n", class05270.f));
         bufferedwriter.write(String.format(Locale.ROOT, "view-distance=%d%n", class05270.c.get()));
         bufferedwriter.write(String.format(Locale.ROOT, "simulation-distance=%d%n", class05270.X.get()));
         bufferedwriter.write(String.format(Locale.ROOT, "generate-structures=%s%n", class05270.NU.u()));
         bufferedwriter.write(String.format(Locale.ROOT, "use-native=%s%n", class05270.J));
         bufferedwriter.write(String.format(Locale.ROOT, "rate-limit=%d%n", class05270.H));
      }
   }

   @Override
   public class03463 N(class03463 var1) {
      var1.N("Is Modded", () -> this.aq_().y());
      var1.N("Type", () -> "Dedicated Server (map_server.txt)");
      return var1;
   }

   public void N(class07086 var1) {
      this.j.N(var2 -> (class05270)var2.m.N(this.yt(), var1));
      this.K();
   }

   public void N(String var1, class07701 var2) {
      this.P.add(new class03656(var1, var2));
   }

   @Override
   public void N(BooleanSupplier var1) {
      super.N(var1);
      if (this.w != null) {
         this.w.N();
      }

      long i = class07536.L();
      int jx = this.S();
      if (jx > 0) {
         long kx = jx * class01517.L;
         if (i - this.k >= kx) {
            this.k = i;
            this.Nt().R();
         }
      }
   }

   @Override
   public String N(String var1) {
      this.T.L();
      this.i(() -> this.yL().N(this.T.R(), var1));
      return this.T.i();
   }

   @Override
   public boolean N(class08774 var1) {
      return false;
   }

   @Override
   public class05477 N(class04770 var1) {
      return this.n != null ? this.n.N(var1.method_7334()) : class05477.N;
   }

   public void N(class06984 var1) {
      this.j.N(var2 -> (class05270)var2.q.N(this.yt(), var1));
   }

   @Override
   public boolean N(class04782 var1, class07209 var2, class08036 var3) {
      class05042 class05042 = var1.method_74854();
      if (var1.method_27983() != class05042.N()) {
         return false;
      } else if (this.Nm().E().u()) {
         return false;
      } else if (this.Nm().R(var3.method_72498())) {
         return false;
      } else if (this.F() <= 0) {
         return false;
      } else {
         class07209 class07209 = class05042.y();
         int i = class04995.N(var2.method_10263() - class07209.method_10263());
         int jx = class04995.N(var2.method_10260() - class07209.method_10260());
         return Math.max(i, jx) <= this.F();
      }
   }

   @Override
   public String W() {
      return this.B.R();
   }

   @Override
   public void R(int var1) {
      this.j.N(var2 -> (class05270)var2.Ni.N(this.yt(), var1));
   }

   @Override
   public boolean R() {
      return this.G;
   }

   public void R(boolean var1) {
      this.j.N(var2 -> (class05270)var2.D.N(this.yt(), var1));
   }

   @Override
   public int Ni() {
      return (Integer)this.y().r.get();
   }

   @Override
   public int Nu() {
      return this.y().e;
   }

   @Override
   public void H() {
      if (this.n != null) {
         this.n.close();
      }

      if (this.v != null) {
         this.v.y();
      }

      if (this.b != null) {
         this.b.y();
      }

      if (this.s != null) {
         this.s.y();
      }

      if (this.w != null) {
         try {
            this.w.N(true);
         } catch (InterruptedException interruptedexception) {
            N.error("Interrupted while stopping the management server", interruptedexception);
         }
      }
   }

   @Override
   public boolean Nz() {
      return (Boolean)this.j.N().NE.get();
   }

   @Override
   public void NZ() {
      super.NZ();
      this.G = this.yV().N(class00429.N);
   }

   public boolean NR() {
      return (Boolean)this.j.N().E.get();
   }

   @Override
   public Optional<class02794> NB() {
      return this.j.N().NL;
   }

   public long NL() {
      return this.y().V;
   }

   @Override
   public boolean NN() {
      return this.y().NZ;
   }

   public class07282 NM() {
      return (class07282)this.y().P.get();
   }

   @Override
   public int NE() {
      return (Integer)this.j.N().Nz.get();
   }

   @Override
   public class02243 NU() {
      return this.l;
   }

   @Override
   public Map<String, String> NW() {
      return this.d;
   }

   protected boolean Ny() {
      boolean flag = false;

      for (int i = 0; !flag && i <= 2; i++) {
         if (i > 0) {
            N.warn("Encountered a problem while converting the user banlist, retrying in a few seconds");
            this.yc();
         }

         flag = class01067.N((class02796)this);
      }

      boolean flag1 = false;

      for (int jx = 0; !flag1 && jx <= 2; jx++) {
         if (jx > 0) {
            N.warn("Encountered a problem while converting the ip banlist, retrying in a few seconds");
            this.yc();
         }

         flag1 = class01067.y(this);
      }

      boolean flag2 = false;

      for (int kx = 0; !flag2 && kx <= 2; kx++) {
         if (kx > 0) {
            N.warn("Encountered a problem while converting the op list, retrying in a few seconds");
            this.yc();
         }

         flag2 = class01067.L(this);
      }

      boolean flag3 = false;

      for (int lx = 0; !flag3 && lx <= 2; lx++) {
         if (lx > 0) {
            N.warn("Encountered a problem while converting the whitelist, retrying in a few seconds");
            this.yc();
         }

         flag3 = class01067.u(this);
      }

      boolean flag4 = false;

      for (int i1 = 0; !flag4 && i1 <= 2; i1++) {
         if (i1 > 0) {
            N.warn("Encountered a problem while converting the player save files, retrying in a few seconds");
            this.yc();
         }

         flag4 = class01067.N(this);
      }

      return flag || flag1 || flag2 || flag3 || flag4;
   }

   private SslContext yH() {
      try {
         return class00439.N(this.y().G, this.y().l);
      } catch (Exception exception) {
         class00439.N();
         throw new IllegalStateException("Failed to configure TLS for the server management protocol", exception);
      }
   }

   private void yc() {
      try {
         Thread.sleep(5000L);
      } catch (InterruptedException interruptedexception) {
      }
   }

   private static Map<String, String> ye() {
      Path path = Path.of("codeofconduct");
      if (!Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS)) {
         throw new IllegalArgumentException("Code of Conduct folder does not exist: " + path);
      } else {
         try {
            Builder builder = ImmutableMap.builder();

            try (Stream<Path> stream = Files.list(path)) {
               for (Path path1 : stream.toList()) {
                  String sx = path1.getFileName().toString();
                  if (sx.endsWith(".txt")) {
                     String s1 = sx.substring(0, sx.length() - 4).toLowerCase(Locale.ROOT);
                     if (!path1.toRealPath().getParent().equals(path.toAbsolutePath())) {
                        throw new IllegalArgumentException(
                           "Failed to read Code of Conduct file \"" + sx + "\" because it links to a file outside the allowed directory"
                        );
                     }

                     try {
                        String s2 = String.join("\n", Files.readAllLines(path1, StandardCharsets.UTF_8));
                        builder.put(s1, class05018.N(s2));
                     } catch (IOException ioexception) {
                        throw new IllegalArgumentException("Failed to read Code of Conduct file " + sx, ioexception);
                     }
                  }
               }
            }

            return builder.build();
         } catch (IOException ioexception1) {
            throw new IllegalArgumentException("Failed to read Code of Conduct folder", ioexception1);
         }
      }
   }

   @Override
   public boolean C_() {
      return (Boolean)this.j.N().W.get();
   }

   @Override
   public boolean D_() {
      return (Boolean)this.j.N().NM.get();
   }
}
