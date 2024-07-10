/*
 * BSD 2-Clause License
 *
 * Copyright (c) 2021, Riley McGee
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.wastedbankspace.model.locations;

import com.wastedbankspace.model.StorableItem;
import lombok.Getter;
import net.runelite.api.ItemID;

@Getter
public enum TackleBox implements StorableItem {
    //Equipment
    ANGLER_BOOTS(ItemID.ANGLER_BOOTS),
    ANGLER_HAT(ItemID.ANGLER_HAT),
    ANGLER_TOP(ItemID.ANGLER_TOP),
    ANGLER_WADERS(ItemID.ANGLER_WADERS),

    SPIRIT_ANGLER_BOOTS(ItemID.SPIRIT_ANGLER_BOOTS),
    SPIRIT_ANGLER_HEADBAND(ItemID.SPIRIT_ANGLER_HEADBAND),
    SPIRIT_ANGLER_TOP(ItemID.SPIRIT_ANGLER_TOP),
    SPIRIT_ANGLER_WADERS(ItemID.SPIRIT_ANGLER_WADERS),

    FISHBOWL_HELMET(ItemID.FISHBOWL_HELMET),
    FLIPPERS(ItemID.FLIPPERS),
    DARK_FLIPPERS(ItemID.DARK_FLIPPERS),
    DIVING_APPARATUS(ItemID.DIVING_APPARATUS),

    RADAS_BLESSING_1(ItemID.RADAS_BLESSING_1),
    RADAS_BLESSING_2(ItemID.RADAS_BLESSING_2),
    RADAS_BLESSING_3(ItemID.RADAS_BLESSING_3),
    RADAS_BLESSING_4(ItemID.RADAS_BLESSING_4),

    TINY_NET(ItemID.TINY_NET),
    HARPOON(ItemID.HARPOON),
    BARBTAIL_HARPOON(ItemID.BARBTAIL_HARPOON),
    DRAGON_HARPOON(ItemID.DRAGON_HARPOON),
    INFERNAL_HARPOON(ItemID.INFERNAL_HARPOON),
    DRAGON_HARPOON_OR(ItemID.DRAGON_HARPOON_OR),
    INFERNAL_HARPOON_OR(ItemID.INFERNAL_HARPOON_OR),
    CRYSTAL_HARPOON(ItemID.CRYSTAL_HARPOON),
    MERFOLK_TRIDENT(ItemID.MERFOLK_TRIDENT),
    FISHING_ROD(ItemID.FISHING_ROD),
    FLY_FISHING_ROD(ItemID.FLY_FISHING_ROD),
    OILY_FISHING_ROD(ItemID.OILY_FISHING_ROD),
    BARBARIAN_ROD(ItemID.BARBARIAN_ROD),
    PEARL_FISHING_ROD(ItemID.PEARL_FISHING_ROD),
    PEARL_FLY_FISHING_ROD(ItemID.PEARL_FLY_FISHING_ROD),
    OILY_PEARL_FISHING_ROD(ItemID.OILY_PEARL_FISHING_ROD),
    PEARL_BARBARIAN_ROD(ItemID.PEARL_BARBARIAN_ROD),
    SMALL_FISHING_NET(ItemID.SMALL_FISHING_NET),
    BIG_FISHING_NET(ItemID.BIG_FISHING_NET),
    DRIFT_NET(ItemID.DRIFT_NET),
    LOBSTER_POT(ItemID.LOBSTER_POT),
    KARAMBWAN_VESSEL(ItemID.KARAMBWAN_VESSEL),
    KARAMBWAN_VESSEL_FILLED(ItemID.KARAMBWAN_VESSEL_3159),

    //Bait
    SPIRIT_FLAKES(ItemID.SPIRIT_FLAKES),
    FEATHERS(ItemID.FEATHER),
    RAW_KARAMBWANJI(ItemID.RAW_KARAMBWANJI),
    FISHING_BAIT(ItemID.FISHING_BAIT),
    DARK_FISHING_BAIT(ItemID.DARK_FISHING_BAIT),
    SANDWORMS(ItemID.SANDWORMS),
    FISH_OFFCUTS(ItemID.FISH_OFFCUTS),
    FISH_CHUNKS(ItemID.FISH_CHUNKS),
    //Misc
    FISHING_POTION1(ItemID.FISHING_POTION1),
    FISHING_POTION2(ItemID.FISHING_POTION2),
    FISHING_POTION3(ItemID.FISHING_POTION3),
    FISHING_POTION4(ItemID.FISHING_POTION4),
    MOLCH_PEARLS(ItemID.MOLCH_PEARL);

    private final int itemID;
    @Getter
    private final String location = "Tackle Box";

    TackleBox(int itemID) {
        this.itemID = itemID;
    }
}
