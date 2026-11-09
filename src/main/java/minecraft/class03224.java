package minecraft;

import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public record class03224(
   Instant recordingStarted,
   Instant recordingEnded,
   Duration recordingDuration,
   Duration worldCreationDuration,
   List<class08175> fps,
   List<class03228> serverTickTimes,
   List<class03226> cpuLoadStats,
   class03214 heapSummary,
   class03204 threadAllocationSummary,
   class04326<class04335> receivedPacketsSummary,
   class04326<class04335> sentPacketsSummary,
   class04326<class02299> writtenChunks,
   class04326<class02299> readChunks,
   class03234 fileWrites,
   class03234 fileReads,
   List<class03201> chunkGenStats,
   List<class00323> structureGenStats
) {
   public Instant L() {
      return this.recordingStarted;
   }

   public List<class08175> M() {
      return this.fps;
   }

   public class04326<class02299> P() {
      return this.readChunks;
   }

   public class03234 T() {
      return this.fileReads;
   }

   public class03224(
      Instant recordingStarted,
      Instant recordingEnded,
      Duration recordingDuration,
      @Nullable Duration worldCreationDuration,
      List<class08175> fps,
      List<class03228> serverTickTimes,
      List<class03226> cpuLoadStats,
      class03214 heapSummary,
      class03204 threadAllocationSummary,
      class04326<class04335> receivedPacketsSummary,
      class04326<class04335> sentPacketsSummary,
      class04326<class02299> writtenChunks,
      class04326<class02299> readChunks,
      class03234 fileWrites,
      class03234 fileReads,
      List<class03201> chunkGenStats,
      List<class00323> structureGenStats
   ) {
      super();
      this.recordingStarted = recordingStarted;
      this.recordingEnded = recordingEnded;
      this.recordingDuration = recordingDuration;
      this.worldCreationDuration = worldCreationDuration;
      this.fps = fps;
      this.serverTickTimes = serverTickTimes;
      this.cpuLoadStats = cpuLoadStats;
      this.heapSummary = heapSummary;
      this.threadAllocationSummary = threadAllocationSummary;
      this.receivedPacketsSummary = receivedPacketsSummary;
      this.sentPacketsSummary = sentPacketsSummary;
      this.writtenChunks = writtenChunks;
      this.readChunks = readChunks;
      this.fileWrites = fileWrites;
      this.fileReads = fileReads;
      this.chunkGenStats = chunkGenStats;
      this.structureGenStats = structureGenStats;
   }

   public List<class03228> B() {
      return this.serverTickTimes;
   }

   public List<class03226> Z() {
      return this.cpuLoadStats;
   }

   public Duration i() {
      return this.recordingDuration;
   }

   public List<class03201> b() {
      return this.chunkGenStats;
   }

   public class03234 s() {
      return this.fileWrites;
   }

   public class04326<class02299> m() {
      return this.writtenChunks;
   }

   public List<class00323> j() {
      return this.structureGenStats;
   }

   public class03204 U() {
      return this.threadAllocationSummary;
   }

   public class03214 z() {
      return this.heapSummary;
   }

   public Instant u() {
      return this.recordingEnded;
   }

   public String y() {
      return new class03227().N(this);
   }

   public class04326<class04335> E() {
      return this.receivedPacketsSummary;
   }

   public List<Pair<class00549, class03205<class03201>>> N() {
      return this.chunkGenStats
         .stream()
         .collect(Collectors.groupingBy(class03201::u))
         .entrySet()
         .stream()
         .map(var0 -> Pair.of(var0.getKey(), class03205.N(var0.getValue())))
         .filter(var0 -> ((Optional)var0.getSecond()).isPresent())
         .map(var0 -> Pair.of((class00549)var0.getFirst(), (class03205)((Optional)var0.getSecond()).get()))
         .sorted(Comparator.<Pair<class00549, class03205<class03201>>, Duration>comparing(var0 -> ((class03205)var0.getSecond()).R()).reversed())
         .toList();
   }

   public class04326<class04335> W() {
      return this.sentPacketsSummary;
   }

   @Nullable
   public Duration R() {
      return this.worldCreationDuration;
   }
}
