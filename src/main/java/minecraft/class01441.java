package minecraft;

import org.joml.Vector2i;

record class01441(class06584 item, Vector2i start, Vector2i end, long time) {

   public Vector2i L() {
      return this.end;
   }

   class01441(class06584 item, Vector2i start, Vector2i end, long time) {
      this.item = item;
      this.start = start;
      this.end = end;
      this.time = time;
   }

   public long u() {
      return this.time;
   }

   public Vector2i y() {
      return this.start;
   }

   public class06584 N() {
      return this.item;
   }
}
