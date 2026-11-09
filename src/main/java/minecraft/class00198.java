package minecraft;

import com.google.common.base.Splitter;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map.Entry;
import org.slf4j.Logger;

public class class00198 {
   private static final Logger y = LogUtils.getLogger();
   public static final Splitter N = Splitter.on('/');

   public class00198() {
      super();
   }

   public static Path N(Path var0, String var1) {
      Path path = var0.resolve("objects");
      class02986 class02986 = class02993.L();
      Path path1 = var0.resolve("indexes/" + var1 + ".json");

      try (BufferedReader bufferedreader = Files.newBufferedReader(path1, StandardCharsets.UTF_8)) {
         JsonObject jsonobject = class05001.N(bufferedreader);
         JsonObject jsonobject1 = class05001.N(jsonobject, "objects", null);
         if (jsonobject1 != null) {
            for (Entry entry : jsonobject1.entrySet()) {
               JsonObject jsonobject2 = (JsonObject)entry.getValue();
               String s = (String)entry.getKey();
               List<String> list = N.splitToList(s);
               String s1 = class05001.Z(jsonobject2, "hash");
               Path path2 = path.resolve(s1.substring(0, 2) + "/" + s1);
               class02986.N(list, path2);
            }
         }
      } catch (JsonParseException jsonparseexception) {
         y.error("Unable to parse resource index file: {}", path1);
      } catch (IOException ioexception) {
         y.error("Can't open the resource index file: {}", path1);
      }

      return class02986.N("index-" + var1).getPath("/");
   }
}
