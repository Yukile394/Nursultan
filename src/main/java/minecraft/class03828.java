package minecraft;

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.slf4j.Logger;

public class class03828 {
   private static final Logger N = LogUtils.getLogger();

   public class03828() {
      super();
   }

   public static void N(Path var0, int var1) {
      try {
         List<class03823> list = N(var0);
         int i = list.size() - var1;
         if (i <= 0) {
            return;
         }

         list.sort(class03823.y);
         List<class03835> list1 = N(list);
         Collections.reverse(list1);
         list1.sort(class03835.L);
         HashSet hashset = new HashSet();

         for (int j = 0; j < i; j++) {
            class03835 class03835 = list1.get(j);
            Path path = class03835.N();

            try {
               Files.delete(path);
               if (class03835.y() == 0) {
                  hashset.add(path.getParent());
               }
            } catch (IOException ioexception1) {
               N.warn("Failed to delete cache file {}", path, ioexception1);
            }
         }

         hashset.remove(var0);

         for (Path path1 : hashset) {
            try {
               Files.delete(path1);
            } catch (DirectoryNotEmptyException directorynotemptyexception) {
            } catch (IOException ioexception) {
               N.warn("Failed to delete empty(?) cache directory {}", path1, ioexception);
            }
         }
      } catch (UncheckedIOException | IOException ioexception2) {
         N.error("Failed to vacuum cache dir {}", var0, ioexception2);
      }
   }

   private static List<class03835> N(List<class03823> var0) {
      ArrayList arraylist = new ArrayList();
      Object2IntOpenHashMap object2intopenhashmap = new Object2IntOpenHashMap();

      for (class03823 class03823 : var0) {
         int i = object2intopenhashmap.addTo(class03823.N().getParent(), 1);
         arraylist.add(new class03835(class03823.N(), i));
      }

      return arraylist;
   }

   private static List<class03823> N(Path var0) throws IOException {
      try {
         ArrayList arraylist = new ArrayList();
         Files.walkFileTree(var0, new class03846(var0, arraylist));
         return arraylist;
      } catch (NoSuchFileException nosuchfileexception) {
         return List.of();
      }
   }
}
