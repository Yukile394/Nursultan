package minecraft;

import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class class02129 {
   static final Map<String, class02129> N = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<class02129> y = Codec.STRING.comapFlatMap(var0 -> {
      class02129 class02129 = N.get(var0);
      return class02129 != null ? DataResult.success(class02129) : DataResult.error(() -> "No TelemetryEventType with key: '" + var0 + "'");
   }, class02129::N);
   private static final List<class02117<?>> Z = List.of(
      class02117.N, class02117.y, class02117.L, class02117.u, class02117.i, class02117.R, class02117.M, class02117.B, class02117.W, class02117.E
   );
   private static final List<class02117<?>> z = Stream.concat(Z.stream(), Stream.of(class02117.Z, class02117.z, class02117.U)).toList();
   public static final class02129 L = N("world_loaded", "WorldLoaded").N(z).N(class02117.m).N(class02117.P).y();
   public static final class02129 u = N("performance_metrics", "PerformanceMetrics")
      .N(z)
      .N(class02117.b)
      .N(class02117.j)
      .N(class02117.v)
      .N(class02117.n)
      .N(class02117.t)
      .N(class02117.G)
      .N()
      .y();
   public static final class02129 i = N("world_load_times", "WorldLoadTimes").N(z).N(class02117.l).N(class02117.d).N().y();
   public static final class02129 R = N("world_unloaded", "WorldUnloaded").N(z).N(class02117.s).N(class02117.T).y();
   public static final class02129 M = N("advancement_made", "AdvancementMade").N(z).N(class02117.O).N(class02117.g).N().y();
   public static final class02129 B = N("game_load_times", "GameLoadTimes").N(Z).N(class02117.w).N(class02117.k).N(class02117.Y).N(class02117.Q).N().y();
   private final String U;
   private final String E;
   private final List<class02117<?>> W;
   private final boolean m;
   private final MapCodec<class04199> P;

   public MapCodec<class04199> L() {
      return this.P;
   }

   public static List<class02129> M() {
      return List.copyOf(N.values());
   }

   class02129(String var1, String var2, List<class02117<?>> var3, boolean var4) {
      super();
      this.U = var1;
      this.E = var2;
      this.W = var3;
      this.m = var4;
      this.P = class02108.N(var3).xmap(var1x -> new class04199(this, var1x), class04199::y);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.U + "]";
   }

   public class05216 i() {
      return this.N("title");
   }

   public boolean u() {
      return this.m;
   }

   public List<class02117<?>> y() {
      return this.W;
   }

   public static class02095 N(String var0, String var1) {
      return new class02095(var0, var1);
   }

   private class05216 N(String var1) {
      return class00392.L("telemetry.event." + this.U + "." + var1);
   }

   public <T> boolean N(class02117<T> var1) {
      return this.W.contains(var1);
   }

   public TelemetryEvent N(TelemetrySession var1, class02108 var2) {
      TelemetryEvent telemetryevent = var1.createNewEvent(this.E);
      Iterator iterator = this.W.iterator();

      while (iterator.hasNext()) {
         ((class02117)iterator.next()).N(var2, telemetryevent);
      }

      return telemetryevent;
   }

   public String N() {
      return this.U;
   }

   public class05216 R() {
      return this.N("description");
   }
}
