package mcjty.theoneprobe.mods;

import mcjty.theoneprobe.TheOneProbe;
import mcjty.theoneprobe.apiimpl.TheOneProbeImp;
import mcjty.theoneprobe.config.Config;
import mcjty.theoneprobe.mods.BotanicAdditions.DreamingManaPool;
import mcjty.theoneprobe.mods.BotanicAdditions.ElvenAltar;
import mcjty.theoneprobe.mods.ExtraBotany.ManaBuffer;
import mcjty.theoneprobe.mods.ExtraBotany.QuantumManaBuffer;
import mcjty.theoneprobe.mods.botania.ManaPool;
import mcjty.theoneprobe.mods.botania.RuneAltar;
import mcjty.theoneprobe.mods.botania.Spreader;
import mcjty.theoneprobe.mods.botania.TerraPlate;
import mcjty.theoneprobe.mods.crt.CrtTop;
import mcjty.theoneprobe.mods.ember_top.*;
import mcjty.theoneprobe.mods.thaumcraft.AspectElement;
import mcjty.theoneprobe.mods.thaumcraft.ThaumHighlightInfoProvider;
import net.minecraftforge.fml.common.Loader;

public class TOPHandler {
    public static void registerTips() {
        TheOneProbeImp theOneProbeImp = TheOneProbe.theOneProbeImp;
        if (Config.Botaniatop) {
            if (Loader.isModLoaded("botania")) {
                theOneProbeImp.registerProvider(new ManaPool());
                theOneProbeImp.registerProvider(new Spreader());
                theOneProbeImp.registerProvider(new TerraPlate());
                theOneProbeImp.registerProvider(new RuneAltar());
            }
            if (Loader.isModLoaded("extrabotany")) {
                theOneProbeImp.registerProvider(new ManaBuffer());
                theOneProbeImp.registerProvider(new QuantumManaBuffer());
            }
            if (Loader.isModLoaded("botanicadds")) {
                theOneProbeImp.registerProvider(new DreamingManaPool());
                theOneProbeImp.registerProvider(new ElvenAltar());
            }
        }
        if (Loader.isModLoaded("embers")) {
            theOneProbeImp.registerProvider(new ember_coppercell());
            theOneProbeImp.registerProvider(new ember_auto_hummer());
            theOneProbeImp.registerProvider(new ember_beam_cannon());
            theOneProbeImp.registerProvider(new ember_cinder_plinth());
            theOneProbeImp.registerProvider(new ember_furnace());
            theOneProbeImp.registerProvider(new ember_mixer());
            theOneProbeImp.registerProvider(new ember_stamper());
            theOneProbeImp.registerProvider(new ember_crystal_cell());
            theOneProbeImp.registerProvider(new ember_emitter());
            theOneProbeImp.registerProvider(new ember_receiver());
            theOneProbeImp.registerProvider(new ember_activator());
            theOneProbeImp.registerProvider(new ember_BeamSplitter());
            theOneProbeImp.registerProvider(new ember_alchemy_pedestal());
            theOneProbeImp.registerProvider(new ember_emberinjector());
            theOneProbeImp.registerProvider(new ember_reactor());
            theOneProbeImp.registerProvider(new ember_pulser());
            theOneProbeImp.registerProvider(new ember_funnel());
            theOneProbeImp.registerProvider(new ember_boiler());
        }
        if (Loader.isModLoaded("crafttweaker")) {
            theOneProbeImp.registerProvider(new CrtTop());
        }
        if (Loader.isModLoaded("thaumcraft")) {
            TheOneProbe.ELEM_ID_ASPECT = TheOneProbe.theOneProbeImp.registerElementFactory(new AspectElement.Factory());
            theOneProbeImp.registerProvider(new ThaumHighlightInfoProvider());
        }
    }
}

