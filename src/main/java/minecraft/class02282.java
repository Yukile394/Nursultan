package minecraft;

import jdk.jfr.Category;
import jdk.jfr.Enabled;
import jdk.jfr.Event;
import jdk.jfr.Label;
import jdk.jfr.Name;
import jdk.jfr.StackTrace;

@Category({"Minecraft", "Storage"})
@StackTrace(false)
@Enabled(false)
public abstract class class02282 extends Event {
   @Name("regionPosX")
   @Label("Region X Position")
   public final int N;
   @Name("regionPosZ")
   @Label("Region Z Position")
   public final int y;
   @Name("localPosX")
   @Label("Local X Position")
   public final int L;
   @Name("localPosZ")
   @Label("Local Z Position")
   public final int u;
   @Name("chunkPosX")
   @Label("Chunk X Position")
   public final int i;
   @Name("chunkPosZ")
   @Label("Chunk Z Position")
   public final int R;
   @Name("level")
   @Label("Level Id")
   public final String M;
   @Name("dimension")
   @Label("Dimension")
   public final String B;
   @Name("type")
   @Label("Type")
   public final String Z;
   @Name("compression")
   @Label("Compression")
   public final String z;
   @Name("bytes")
   @Label("Bytes")
   public final int U;

   public class02282(class02277 var1, class07321 var2, class05530 var3, int var4) {
      super();
      this.N = var2.Z();
      this.y = var2.z();
      this.L = var2.U();
      this.u = var2.E();
      this.i = var2.B;
      this.R = var2.Z;
      this.M = var1.N();
      this.B = var1.y().N().toString();
      this.Z = var1.L();
      this.z = "standard:" + var3.y();
      this.U = var4;
   }
}
