package minecraft;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.Lifecycle;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class06207 implements class05081, class05212 {
   private static final Logger R = LogUtils.getLogger();
   public static final String N = "LevelName";
   protected static final String y = "Player";
   protected static final String L = "WorldGenSettings";
   private class07312 M;
   private final class05934 B;
   private final class06228 Z;
   private final Lifecycle z;
   private class05042 U;
   private long E;
   private long W;
   @Nullable
   private final class07001 m;
   private final int P;
   private int s;
   private boolean T;
   private int b;
   private boolean j;
   private int v;
   private boolean n;
   private boolean t;
   @Deprecated
   private Optional<class08074> G;
   private class07826 l;
   @Nullable
   private class07001 d;
   private int w;
   private int k;
   @Nullable
   private UUID Y;
   private final Set<String> Q;
   private boolean O;
   private final Set<String> g;
   private final class00754<class02796> I;

   @Override
   public boolean w() {
      return this.Z == class06228.field_40375;
   }

   @Override
   public long L() {
      return this.W;
   }

   @Override
   public void L(int var1) {
      this.b = var1;
   }

   @Override
   public void L(boolean var1) {
      this.n = var1;
   }

   @Override
   public int M() {
      return this.v;
   }

   @Override
   public Optional<class08074> P() {
      return this.G;
   }

   @Override
   public boolean T() {
      return this.t;
   }

   @Override
   public class03776 Q() {
      return this.M.M();
   }

   private class06207(
      @Nullable class07001 var1,
      boolean var2,
      class05042 var3,
      long var4,
      long var6,
      int var8,
      int var9,
      int var10,
      boolean var11,
      int var12,
      boolean var13,
      boolean var14,
      boolean var15,
      Optional<class08074> var16,
      int var17,
      int var18,
      @Nullable UUID var19,
      Set<String> var20,
      Set<String> var21,
      class00754<class02796> var22,
      @Nullable class07001 var23,
      class07826 var24,
      class07312 var25,
      class05934 var26,
      class06228 var27,
      Lifecycle var28
   ) {
      super();
      this.O = var2;
      this.U = var3;
      this.E = var4;
      this.W = var6;
      this.P = var8;
      this.s = var9;
      this.b = var10;
      this.T = var11;
      this.v = var12;
      this.j = var13;
      this.n = var14;
      this.t = var15;
      this.G = var16;
      this.w = var17;
      this.k = var18;
      this.Y = var19;
      this.Q = var20;
      this.g = var21;
      this.m = var1;
      this.I = var22;
      this.d = var23;
      this.l = var24;
      this.M = var25;
      this.B = var26;
      this.Z = var27;
      this.z = var28;
   }

   public class06207(class07312 var1, class05934 var2, class06228 var3, Lifecycle var4) {
      this(
         null,
         false,
         class05042.N,
         0L,
         0L,
         19133,
         0,
         0,
         false,
         0,
         false,
         false,
         false,
         Optional.empty(),
         0,
         0,
         null,
         Sets.newLinkedHashSet(),
         new HashSet<>(),
         new class00754<>(class07229.N),
         null,
         class07826.Z,
         var1.B(),
         var2,
         var3,
         var4
      );
   }

   @Override
   public boolean B() {
      return this.T;
   }

   @Override
   public Set<String> I() {
      return ImmutableSet.copyOf(this.Q);
   }

   @Override
   public Set<String> J() {
      return Set.copyOf(this.g);
   }

   @Override
   public int Z() {
      return this.b;
   }

   @Override
   public void i(int var1) {
      this.k = var1;
   }

   @Override
   public int i() {
      return this.s;
   }

   @Override
   public class00754<class02796> b() {
      return this.I;
   }

   @Override
   public class07086 s() {
      return this.M.u();
   }

   @Nullable
   @Override
   public UUID n() {
      return this.Y;
   }

   @Override
   public class05934 l() {
      return this.B;
   }

   @Override
   public boolean d() {
      return this.Z == class06228.field_40374;
   }

   @Override
   public class07305 m() {
      return this.M.R();
   }

   @Override
   public class05212 o() {
      return this;
   }

   @Override
   public Lifecycle k() {
      return this.z;
   }

   @Nullable
   @Override
   public class07001 t() {
      return this.m;
   }

   @Override
   public boolean g() {
      return this.O;
   }

   @Override
   public int v() {
      return this.k;
   }

   @Override
   public int j() {
      return this.w;
   }

   @Override
   public class07312 q() {
      return this.M.B();
   }

   @Override
   public boolean U() {
      return this.M.L();
   }

   @Override
   public class07282 z() {
      return this.M.y();
   }

   @Override
   public void u(int var1) {
      this.w = var1;
   }

   @Override
   public void u(boolean var1) {
      this.t = var1;
   }

   @Override
   public String u() {
      return this.M.N();
   }

   @Override
   public void y(boolean var1) {
      this.T = var1;
   }

   @Override
   public void y(long var1) {
      this.W = var1;
   }

   @Override
   public long y() {
      return this.E;
   }

   @Override
   public void y(int var1) {
      this.v = var1;
   }

   @Override
   public boolean E() {
      return this.M.i();
   }

   @Override
   public void N(@Nullable class07001 var1) {
      this.d = var1;
   }

   @Override
   public void N(Optional<class08074> var1) {
      this.G = var1;
   }

   @Override
   public void N(UUID var1) {
      this.Y = var1;
   }

   @Override
   public void N(String var1, boolean var2) {
      this.Q.add(var1);
      this.O |= var2;
   }

   @Override
   public class05042 N() {
      return this.U;
   }

   @Override
   public void N(class05042 var1) {
      this.U = var1;
   }

   @Override
   public void N(class07086 var1) {
      this.M = this.M.N(var1);
   }

   private void N(class01042 var1, class07001 var2, @Nullable class07001 var3) {
      var2.N("ServerBrands", N(this.Q));
      var2.N("WasModded", this.O);
      if (!this.g.isEmpty()) {
         var2.N("removed_features", N(this.g));
      }

      class07001 class07001 = new class07001();
      class07001.N_67("Name", class07529.y().comp_4025());
      class07001.N("Id", class07529.y().comp_4026().y());
      class07001.N("Snapshot", !class07529.y().comp_4031());
      class07001.N_67("Series", class07529.y().comp_4026().L());
      var2.N("Version", class07001);
      class07717.i(var2);
      class03796.N(var1.N(class07713.N), this.B, var1)
         .resultOrPartial(class07536.N("WorldGenSettings: ", R::error))
         .ifPresent(var1x -> var2.N("WorldGenSettings", var1x));
      var2.N("GameType", this.M.y().N());
      var2.N("spawn", class05042.L, this.U);
      var2.N("Time", this.E);
      var2.N("DayTime", this.W);
      var2.N("LastPlayed", class07536.i());
      var2.N_67("LevelName", this.M.N());
      var2.N("version", 19133);
      var2.N("clearWeatherTime", this.s);
      var2.N("rainTime", this.b);
      var2.N("raining", this.T);
      var2.N("thunderTime", this.v);
      var2.N("thundering", this.j);
      var2.N("hardcore", this.M.L());
      var2.N("allowCommands", this.M.i());
      var2.N("initialized", this.n);
      this.G.ifPresent(var1x -> var2.N("world_border", class08074.y, var1x));
      var2.N("Difficulty", (byte)this.M.u().N());
      var2.N("DifficultyLocked", this.t);
      var2.N("game_rules", class07305.N(this.K()), this.M.R());
      var2.N("DragonFight", class07826.B, this.l);
      if (var3 != null) {
         var2.N("Player", var3);
      }

      var2.N(class03776.y, this.M.M());
      if (this.d != null) {
         var2.N("CustomBossEvents", this.d);
      }

      var2.N("ScheduledEvents", this.I.y());
      var2.N("WanderingTraderSpawnDelay", this.w);
      var2.N("WanderingTraderSpawnChance", this.k);
      var2.y("WanderingTraderId", class01487.N, this.Y);
   }

   @Override
   public void N(int var1) {
      this.s = var1;
   }

   @Override
   public void N(boolean var1) {
      this.j = var1;
   }

   @Override
   public void N(long var1) {
      this.E = var1;
   }

   @Override
   public void N(class07282 var1) {
      this.M = this.M.N(var1);
   }

   @Override
   public void N(class07826 var1) {
      this.l = var1;
   }

   public static <T> class06207 N(Dynamic<T> var0, class07312 var1, class06228 var2, class05934 var3, Lifecycle var4) {
      long i = var0.get("Time").asLong(0L);
      return new class06207(
         (class07001)var0.get("Player").flatMap(class07001.N::parse).result().orElse(null),
         var0.get("WasModded").asBoolean(false),
         var0.get("spawn").read(class05042.L).result().orElse(class05042.N),
         i,
         var0.get("DayTime").asLong(i),
         class05976.N(var0).N(),
         var0.get("clearWeatherTime").asInt(0),
         var0.get("rainTime").asInt(0),
         var0.get("raining").asBoolean(false),
         var0.get("thunderTime").asInt(0),
         var0.get("thundering").asBoolean(false),
         var0.get("initialized").asBoolean(true),
         var0.get("DifficultyLocked").asBoolean(false),
         class08074.y.parse(var0.get("world_border").orElseEmptyMap()).result(),
         var0.get("WanderingTraderSpawnDelay").asInt(0),
         var0.get("WanderingTraderSpawnChance").asInt(0),
         (UUID)var0.get("WanderingTraderId").read(class01487.N).result().orElse(null),
         var0.get("ServerBrands").asStream().flatMap(var0x -> var0x.asString().result().stream()).collect(Collectors.toCollection(Sets::newLinkedHashSet)),
         var0.get("removed_features").asStream().flatMap(var0x -> var0x.asString().result().stream()).collect(Collectors.toSet()),
         new class00754<>(class07229.N, var0.get("ScheduledEvents").asStream()),
         (class07001)var0.get("CustomBossEvents").orElseEmptyMap().getValue(),
         var0.get("DragonFight").read(class07826.B).resultOrPartial(R::error).orElse(class07826.Z),
         var1,
         var3,
         var2,
         var4
      );
   }

   @Override
   public void N(class03776 var1) {
      this.M = this.M.N(var1);
   }

   private static class07741 N(Set<String> var0) {
      class07741 class07741 = new class07741();
      var0.stream().map(class07707::N).forEach(class07741::add);
      return class07741;
   }

   @Override
   public class07001 N(class01042 var1, @Nullable class07001 var2) {
      if (var2 == null) {
         var2 = this.m;
      }

      class07001 class07001 = new class07001();
      this.N(var1, class07001, var2);
      return class07001;
   }

   @Override
   public void N(class07074 var1, class05474 var2) {
      class05212.super.N(var1, var2);
      class05081.super.N(var1);
   }

   @Override
   public boolean W() {
      return this.n;
   }

   @Override
   public boolean R() {
      return this.j;
   }

   @Nullable
   @Override
   public class07001 O() {
      return this.d;
   }

   @Override
   public int G() {
      return this.P;
   }

   @Override
   public class07826 Y() {
      return this.l;
   }
}
