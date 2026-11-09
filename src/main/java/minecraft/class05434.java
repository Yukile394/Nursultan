package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;

public record class05434(List<class04982> templates, int page, int size, int total) {
   private static final Logger i = LogUtils.getLogger();

   public int L() {
      return this.page;
   }

   public class05434(int var1) {
      this(List.of(), 0, var1, -1);
   }

   public class05434(List<class04982> templates, int page, int size, int total) {
      super();
      this.templates = templates;
      this.page = page;
      this.size = size;
      this.total = total;
   }

   public int i() {
      return this.total;
   }

   public int u() {
      return this.size;
   }

   public List<class04982> y() {
      return this.templates;
   }

   public boolean N() {
      return this.page * this.size >= this.total && this.page > 0 && this.total > 0 && this.size > 0;
   }

   public static class05434 N(String var0) {
      ArrayList arraylist = new ArrayList();
      int ix = 0;
      int j = 0;
      int k = 0;

      try {
         JsonObject jsonobject = class08314.N(var0).getAsJsonObject();
         if (jsonobject.get("templates").isJsonArray()) {
            Iterator<JsonElement> iterator = jsonobject.get("templates").getAsJsonArray().iterator();

            while (iterator.hasNext()) {
               class04982 class04982 = class04982.N(iterator.next().getAsJsonObject());
               if (class04982 != null) {
                  arraylist.add(class04982);
               }
            }
         }

         ix = class04719.N("page", jsonobject, 0);
         j = class04719.N("size", jsonobject, 0);
         k = class04719.N("total", jsonobject, 0);
      } catch (Exception exception) {
         i.error("Could not parse WorldTemplatePaginatedList", exception);
      }

      return new class05434(arraylist, ix, j, k);
   }
}
