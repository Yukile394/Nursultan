package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.slf4j.Logger;

public record class04966(Map<Long, List<class02689>> servers) {
   private static final Logger y = LogUtils.getLogger();

   public class04966(Map<Long, List<class02689>> servers) {
      this.servers = servers;
   }

   private static List<class02689> N(JsonArray var0) {
      ArrayList arraylist = new ArrayList(var0.size());

      for (JsonElement jsonelement : var0) {
         if (jsonelement.isJsonObject()) {
            UUID uuid = class04719.N("playerId", jsonelement.getAsJsonObject(), null);
            if (uuid != null && !class06202.Nq().y(uuid)) {
               arraylist.add(class02689.N(uuid));
            }
         }
      }

      return arraylist;
   }

   public Map<Long, List<class02689>> N() {
      return this.servers;
   }

   public List<class02689> N(long var1) {
      List<class02689> list = this.servers.get(var1);
      return list != null ? list : List.of();
   }

   public static class04966 N(String var0) {
      Builder builder = ImmutableMap.builder();

      try {
         JsonObject jsonobject = class05001.N(var0);
         if (class05001.u(jsonobject, "lists")) {
            Iterator<JsonElement> iterator = jsonobject.getAsJsonArray("lists").iterator();

            while (iterator.hasNext()) {
               JsonObject jsonobject1 = iterator.next().getAsJsonObject();
               String s = class04719.N("playerList", jsonobject1, null);
               List<class02689> list;
               if (s != null) {
                  JsonElement jsonelement = class08314.N(s);
                  if (jsonelement.isJsonArray()) {
                     list = N(jsonelement.getAsJsonArray());
                  } else {
                     list = Lists.newArrayList();
                  }
               } else {
                  list = Lists.newArrayList();
               }

               builder.put(class04719.N("serverId", jsonobject1, -1L), list);
            }
         }
      } catch (Exception exception) {
         y.error("Could not parse RealmsServerPlayerLists", exception);
      }

      return new class04966(builder.build());
   }
}
