package minecraft;

import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.lang.management.ManagementFactory;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.shaderpack.ShaderPack;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.hardware.GraphicsCard;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.PhysicalMemory;
import oshi.hardware.VirtualMemory;
import oshi.hardware.CentralProcessor.ProcessorIdentifier;

public class class03463 {
   public static final long N = 1048576L;
   private static final long y = 1000000000L;
   private static final Logger L = LogUtils.getLogger();
   private static final String u = System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version");
   private static final String i = System.getProperty("java.version") + ", " + System.getProperty("java.vendor");
   private static final String R = System.getProperty("java.vm.name")
      + " ("
      + System.getProperty("java.vm.info")
      + "), "
      + System.getProperty("java.vm.vendor");
   private final Map<String, String> M = Maps.newLinkedHashMap();

   public class03463() {
      super();
      this.N("Minecraft Version", class07529.y().comp_4025());
      this.N("Minecraft Version ID", class07529.y().comp_4024());
      this.N("Operating System", u);
      this.N("Java Version", i);
      this.N("Java VM Version", R);
      this.N("Memory", () -> {
         Runtime runtime = Runtime.getRuntime();
         long ix = runtime.maxMemory();
         long j = runtime.totalMemory();
         long k = runtime.freeMemory();
         long l = ix / 1048576L;
         long i1 = j / 1048576L;
         long j1 = k / 1048576L;
         return k + " bytes (" + j1 + " MiB) / " + j + " bytes (" + i1 + " MiB) up to " + ix + " bytes (" + l + " MiB)";
      });
      this.N("CPUs", () -> String.valueOf(Runtime.getRuntime().availableProcessors()));
      this.N_39("hardware", () -> this.N(new SystemInfo()));
      this.N("JVM Flags", () -> N((Predicate<String>)(var0 -> var0.startsWith("-X"))));
      this.N("Debug Flags", () -> N((Predicate<String>)(var0 -> var0.startsWith("-DMC_DEBUG_"))));
      this.N(null);
      this.y(null);
   }

   private void y(CallbackInfo var1) {
      if (Iris.getCurrentPackName() != null) {
         this.N("Loaded Shaderpack", () -> {
            StringBuilder stringbuilder = new StringBuilder(Iris.getCurrentPackName() + (Iris.isFallback() ? " (fallback)" : ""));
            Iris.getCurrentPack().ifPresent(var1x -> {
               stringbuilder.append("\n\t\t");
               stringbuilder.append(var1x.getProfileInfo());
            });
            return stringbuilder.toString();
         });
      }
   }

   private void y(String var1, Supplier<String> var2) {
      String s = "Space in storage for " + var1 + " (MiB)";

      try {
         String s1 = (String)var2.get();
         if (s1 == null) {
            this.N(s, "<path not set>");
            return;
         }

         FileStore filestore = Files.getFileStore(Path.of(s1));
         this.N(s, String.format(Locale.ROOT, "available: %.2f, total: %.2f", N(filestore.getUsableSpace()), N(filestore.getTotalSpace())));
      } catch (InvalidPathException invalidpathexception) {
         L.warn("{} is not a path", var1, invalidpathexception);
         this.N(s, "<invalid path>");
      } catch (Exception exception) {
         L.warn("Failed retrieving storage space for {}", var1, exception);
         this.N(s, "ERR");
      }
   }

   private void y() {
      this.N("jna.tmpdir");
      this.N("org.lwjgl.system.SharedLibraryExtractPath");
      this.N("io.netty.native.workdir");
      this.N("java.io.tmpdir");
      this.y("workdir", () -> "");
   }

   private void y(List<GraphicsCard> var1) {
      int ix = 0;

      for (GraphicsCard graphicscard : var1) {
         String s = String.format(Locale.ROOT, "Graphics card #%d ", ix++);
         this.N(s + "name", graphicscard::getName);
         this.N(s + "vendor", graphicscard::getVendor);
         this.N(s + "VRAM (MiB)", () -> String.format(Locale.ROOT, "%.2f", N(graphicscard.getVRam())));
         this.N(s + "deviceId", graphicscard::getDeviceId);
         this.N(s + "versionInfo", graphicscard::getVersionInfo);
      }
   }

   private void N_39(String var1, Runnable var2) {
      try {
         var2.run();
      } catch (Throwable throwable) {
         L.warn("Failed retrieving info for group {}", var1, throwable);
      }
   }

   private void N(CallbackInfo var1) {
      this.N("Fabric Mods", () -> {
         ArrayList arraylist = new ArrayList();

         for (ModContainer modcontainer : FabricLoader.getInstance().getAllMods()) {
            if (modcontainer.getContainingMod().isEmpty()) {
               arraylist.add(modcontainer);
            }
         }

         StringBuilder stringbuilder = new StringBuilder();
         N(stringbuilder, 2, arraylist);
         return stringbuilder.toString();
      });
   }

   private void N(SystemInfo var1) {
      HardwareAbstractionLayer hardwareabstractionlayer = var1.getHardware();
      this.N_39("processor", () -> this.N(hardwareabstractionlayer.getProcessor()));
      this.N_39("graphics", () -> this.y(hardwareabstractionlayer.getGraphicsCards()));
      this.N_39("memory", () -> this.N(hardwareabstractionlayer.getMemory()));
      this.N_39("storage", this::y);
   }

   public static float N(long var0) {
      return (float)var0 / 1048576.0F;
   }

   private void N(List<PhysicalMemory> var1) {
      int ix = 0;

      for (PhysicalMemory physicalmemory : var1) {
         String s = String.format(Locale.ROOT, "Memory slot #%d ", ix++);
         this.N(s + "capacity (MiB)", () -> String.format(Locale.ROOT, "%.2f", N(physicalmemory.getCapacity())));
         this.N(s + "clockSpeed (GHz)", () -> String.format(Locale.ROOT, "%.2f", (float)physicalmemory.getClockSpeed() / 1.0E9F));
         this.N(s + "type", physicalmemory::getMemoryType);
      }
   }

   private void N(VirtualMemory var1) {
      this.N("Virtual memory max (MiB)", () -> String.format(Locale.ROOT, "%.2f", N(var1.getVirtualMax())));
      this.N("Virtual memory used (MiB)", () -> String.format(Locale.ROOT, "%.2f", N(var1.getVirtualInUse())));
      this.N("Swap memory total (MiB)", () -> String.format(Locale.ROOT, "%.2f", N(var1.getSwapTotal())));
      this.N("Swap memory used (MiB)", () -> String.format(Locale.ROOT, "%.2f", N(var1.getSwapUsed())));
   }

   private static String N(Predicate<String> var0) {
      List list = ManagementFactory.getRuntimeMXBean().getInputArguments().stream().filter(var0).toList();
      return String.format(Locale.ROOT, "%d total; %s", list.size(), String.join(" ", list));
   }

   public void N(String var1, String var2) {
      this.M.put(var1, var2);
   }

   public void N(String var1, Supplier<String> var2) {
      try {
         this.N(var1, (String)var2.get());
      } catch (Exception exception) {
         L.warn("Failed to get system info for {}", var1, exception);
         this.N(var1, "ERR");
      }
   }

   private static void N(StringBuilder var0, int var1, ArrayList var2) {
      var2.sort(Comparator.comparing(var0x -> var0x.getMetadata().getId()));

      for (ModContainer modcontainer : var2) {
         var0.append('\n');
         var0.append("\t".repeat(var1));
         var0.append(modcontainer.getMetadata().getId());
         var0.append(": ");
         var0.append(modcontainer.getMetadata().getName());
         var0.append(' ');
         var0.append(modcontainer.getMetadata().getVersion().getFriendlyString());
         if (!modcontainer.getContainedMods().isEmpty()) {
            ArrayList arraylist = new ArrayList(modcontainer.getContainedMods());
            N(var0, var1 + 1, arraylist);
         }
      }
   }

   public void N(StringBuilder var1) {
      var1.append("-- ").append("System Details").append(" --\n");
      var1.append("Details:");
      this.M.forEach((var1x, var2) -> {
         var1.append("\n\t");
         var1.append(var1x);
         var1.append(": ");
         var1.append(var2);
      });
   }

   public String N() {
      return this.M.entrySet().stream().map(var0 -> var0.getKey() + ": " + var0.getValue()).collect(Collectors.joining(System.lineSeparator()));
   }

   private void N(GlobalMemory var1) {
      this.N_39("physical memory", () -> this.N(var1.getPhysicalMemory()));
      this.N_39("virtual memory", () -> this.N(var1.getVirtualMemory()));
   }

   private void N(CentralProcessor var1) {
      ProcessorIdentifier processoridentifier = var1.getProcessorIdentifier();
      this.N("Processor Vendor", processoridentifier::getVendor);
      this.N("Processor Name", processoridentifier::getName);
      this.N("Identifier", processoridentifier::getIdentifier);
      this.N("Microarchitecture", processoridentifier::getMicroarchitecture);
      this.N("Frequency (GHz)", () -> String.format(Locale.ROOT, "%.2f", (float)processoridentifier.getVendorFreq() / 1.0E9F));
      this.N("Number of physical packages", () -> String.valueOf(var1.getPhysicalPackageCount()));
      this.N("Number of physical CPUs", () -> String.valueOf(var1.getPhysicalProcessorCount()));
      this.N("Number of logical CPUs", () -> String.valueOf(var1.getLogicalProcessorCount()));
   }

   private void N(String var1) {
      this.y(var1, () -> System.getProperty(var1));
   }
}
