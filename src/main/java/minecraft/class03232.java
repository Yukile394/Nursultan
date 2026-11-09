package minecraft;

import com.mojang.datafixers.util.Pair;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Spliterators;
import java.util.Map.Entry;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import jdk.jfr.consumer.RecordedEvent;
import jdk.jfr.consumer.RecordingFile;
import org.jspecify.annotations.Nullable;

public class class03232 {
   private Instant N = Instant.EPOCH;
   private Instant y = Instant.EPOCH;
   private final List<class03201> L = new ArrayList<>();
   private final List<class00323> u = new ArrayList<>();
   private final List<class03226> i = new ArrayList<>();
   private final Map<class04335, class03217> R = new HashMap<>();
   private final Map<class04335, class03217> M = new HashMap<>();
   private final Map<class02299, class03217> B = new HashMap<>();
   private final Map<class02299, class03217> Z = new HashMap<>();
   private final List<class03219> z = new ArrayList<>();
   private final List<class03219> U = new ArrayList<>();
   private int E;
   private Duration W = Duration.ZERO;
   private final List<class03225> m = new ArrayList<>();
   private final List<class03203> P = new ArrayList<>();
   private final List<class08175> s = new ArrayList<>();
   private final List<class03228> T = new ArrayList<>();
   @Nullable
   private Duration b = null;

   private class03232(Stream<RecordedEvent> var1) {
      super();
      this.N(var1);
   }

   private void y(RecordedEvent var1, int var2, Map<class02299, class03217> var3) {
      var3.computeIfAbsent(class02299.N(var1), var0 -> new class03217()).N(var2);
   }

   private static <T> class04326<T> N(Duration var0, Map<T, class03217> var1) {
      List list = var1.entrySet().stream().map(var0x -> Pair.of(var0x.getKey(), ((class03217)var0x.getValue()).N())).toList();
      return new class04326<>(var0, list);
   }

   public static class03224 N(Path var0) {
      try {
         class03224 class03224;
         try (RecordingFile recordingfile = new RecordingFile(var0)) {
            class03212 class03212 = new class03212(recordingfile);
            Stream stream = StreamSupport.stream(Spliterators.spliteratorUnknownSize(class03212, 1297), false);
            class03224 = new class03232(stream).N();
         }

         return class03224;
      } catch (IOException ioexception) {
         throw new UncheckedIOException(ioexception);
      }
   }

   private class03224 N() {
      Duration duration = Duration.between(this.N, this.y);
      return new class03224(
         this.N,
         this.y,
         duration,
         this.b,
         this.s,
         this.T,
         this.i,
         class03225.N(duration, this.m, this.W, this.E),
         class03203.N(this.P),
         N(duration, this.R),
         N(duration, this.M),
         N(duration, this.Z),
         N(duration, this.B),
         class03219.N(duration, this.z),
         class03219.N(duration, this.U),
         this.L,
         this.u
      );
   }

   private void N(Stream<RecordedEvent> var1) {
      var1.forEach(var1x -> {
         if (var1x.getEndTime().isAfter(this.y) || this.y.equals(Instant.EPOCH)) {
            this.y = var1x.getEndTime();
         }

         if (var1x.getStartTime().isBefore(this.N) || this.N.equals(Instant.EPOCH)) {
            this.N = var1x.getStartTime();
         }

         String sx = var1x.getEventType().getName();
         switch (sx) {
            case "minecraft.ChunkGeneration":
               this.L.add(class03201.N(var1x));
               break;
            case "minecraft.StructureGeneration":
               this.u.add(class00323.N(var1x));
               break;
            case "minecraft.LoadWorld":
               this.b = var1x.getDuration();
               break;
            case "minecraft.ClientFps":
               this.s.add(class08175.N(var1x, "fps"));
               break;
            case "minecraft.ServerTickTime":
               this.T.add(class03228.N(var1x));
               break;
            case "minecraft.PacketReceived":
               this.N(var1x, var1x.getInt("bytes"), this.R);
               break;
            case "minecraft.PacketSent":
               this.N(var1x, var1x.getInt("bytes"), this.M);
               break;
            case "minecraft.ChunkRegionRead":
               this.y(var1x, var1x.getInt("bytes"), this.B);
               break;
            case "minecraft.ChunkRegionWrite":
               this.y(var1x, var1x.getInt("bytes"), this.Z);
               break;
            case "jdk.ThreadAllocationStatistics":
               this.P.add(class03203.N(var1x));
               break;
            case "jdk.GCHeapSummary":
               this.m.add(class03225.N(var1x));
               break;
            case "jdk.CPULoad":
               this.i.add(class03226.N(var1x));
               break;
            case "jdk.FileWrite":
               this.N(var1x, this.z, "bytesWritten");
               break;
            case "jdk.FileRead":
               this.N(var1x, this.U, "bytesRead");
               break;
            case "jdk.GarbageCollection":
               this.E++;
               this.W = this.W.plus(var1x.getDuration());
         }
      });
   }

   private void N(RecordedEvent var1, int var2, Map<class04335, class03217> var3) {
      var3.computeIfAbsent(class04335.N(var1), var0 -> new class03217()).N(var2);
   }

   private void N(RecordedEvent var1, List<class03219> var2, String var3) {
      var2.add(new class03219(var1.getDuration(), var1.getString("path"), var1.getLong(var3)));
   }
}
