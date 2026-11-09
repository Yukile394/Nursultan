package minecraft;

import Nursultan.class10452;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Platform;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.Kernel32;
import com.sun.jna.platform.win32.Kernel32Util;
import com.sun.jna.platform.win32.Version;
import com.sun.jna.platform.win32.Win32Exception;
import com.sun.jna.platform.win32.Tlhelp32.MODULEENTRY32W;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class class04544 {
   private static final Logger N = LogUtils.getLogger();
   private static final int y = 65535;
   private static final int L = 1033;
   private static final int u = -65536;
   private static final int i = 78643200;

   public class04544() {
      super();
   }

   private static String y(Pointer var0, String var1, IntByReference var2) {
      try {
         byte[] abyte = N(var0, var1, var2).getByteArray(0L, (var2.getValue() - 1) * 2);
         return new String(abyte, StandardCharsets.UTF_16LE);
      } catch (Exception exception) {
         return "";
      }
   }

   public static void N(class07074 var0) {
      var0.N("Modules", () -> N().stream().sorted(Comparator.comparing(var0x -> var0x.N)).map(var0x -> "\n\t\t" + var0x).collect(Collectors.joining()));
   }

   private static Optional<class10452> N(String var0) {
      try {
         IntByReference intbyreference = new IntByReference();
         int ix = Version.INSTANCE.GetFileVersionInfoSize(var0, intbyreference);
         if (ix == 0) {
            int i1 = Native.getLastError();
            if (i1 != 1813 && i1 != 1812) {
               throw new Win32Exception(i1);
            } else {
               return Optional.empty();
            }
         } else {
            Memory memory = new Memory(ix);
            if (!Version.INSTANCE.GetFileVersionInfo(var0, 0, ix, memory)) {
               throw new Win32Exception(Native.getLastError());
            } else {
               IntByReference intbyreference1 = new IntByReference();
               OptionalInt optionalint = N(N(memory, "\\VarFileInfo\\Translation", intbyreference1).getIntArray(0L, intbyreference1.getValue() / 4));
               if (optionalint.isEmpty()) {
                  return Optional.empty();
               } else {
                  int j = optionalint.getAsInt();
                  int k = j & 65535;
                  int l = (j & -65536) >> 16;
                  String s = y(memory, N("FileDescription", k, l), intbyreference1);
                  String s1 = y(memory, N("CompanyName", k, l), intbyreference1);
                  String s2 = y(memory, N("FileVersion", k, l), intbyreference1);
                  return Optional.of(new class10452(s, s2, s1));
               }
            }
         }
      } catch (Exception exception) {
         N.info("Failed to find module info for {}", var0, exception);
         return Optional.empty();
      }
   }

   private static String N(String var0, int var1, int var2) {
      return String.format(Locale.ROOT, "\\StringFileInfo\\%04x%04x\\%s", var1, var2, var0);
   }

   private static OptionalInt N(int[] var0) {
      OptionalInt optionalint = OptionalInt.empty();

      for (int ix : var0) {
         if ((ix & -65536) == 78643200 && (ix & 65535) == 1033) {
            return OptionalInt.of(ix);
         }

         optionalint = OptionalInt.of(ix);
      }

      return optionalint;
   }

   private static Pointer N(Pointer var0, String var1, IntByReference var2) {
      PointerByReference pointerbyreference = new PointerByReference();
      if (!Version.INSTANCE.VerQueryValue(var0, var1, pointerbyreference, var2)) {
         throw new UnsupportedOperationException("Can't get version value " + var1);
      } else {
         return pointerbyreference.getValue();
      }
   }

   public static List<class04572> N() {
      if (!Platform.isWindows()) {
         return ImmutableList.of();
      } else {
         int ix = Kernel32.INSTANCE.GetCurrentProcessId();
         Builder builder = ImmutableList.builder();

         for (MODULEENTRY32W moduleentry32w : Kernel32Util.getModules(ix)) {
            String s = moduleentry32w.szModule();
            Optional<class10452> optional = N(moduleentry32w.szExePath());
            builder.add(new class04572(s, optional));
         }

         return builder.build();
      }
   }
}
