# SafeBase

An easy-to-craft, almost transparent force field to protect your base!  Number per tribe configurable!

## Warning
Please be aware, this is a fork of LaoArchAngel's fantastic SafeBase Mod for Ark! I just fixed a newly introduced bug (by ark itself / januar 2021) and I'm not a modder! This mod will seamless replace the origin mod.

## Steam Workshop
 * Origin: http://steamcommunity.com/sharedfiles/filedetails/?id=1235049753
 * Current: https://steamcommunity.com/sharedfiles/filedetails/?id=2386532930

## What It Does
Adds a new engram for a modified Tek Shield that is immune to damage, does not require tek engrams, and does not burn fuel.  This is perfect for PvP servers that want to allow tribes to have a small base that is completely protected.

## Features
* Clean and completely stackable.
* Shield max size is configurable.  Default max size is the same as a tek shield.
* Configurable limit on number of shields per tribe.  Default is one.
* Shield opacity is adjustable to 0.1 at 1.0 This means it won't look horrible in dark places, like the Aberration map.
* The shield ignores babies!  Baby dinos will no longer be thrust out into oblivion.
* Does not require access to tek.
* Does not require fuel.

## Known Bugs
* A Dino with massive damage (mostly from a mod like ARK Primal Fear) can bite through the shield. Solution: Don't use this kind of mod or atleast do not put the dino on the border of the shield. Will be not fixed!
* Rockdrages can bug through the shield (its the same bug what can happen with the tek shield). Can not be fixed!

## Configuration

* **ShieldSizeMult**
  * Float
  * Multiplies the default tek shield size by this number.
  * Default is 1.0.
* **TribeLimit**
  * Integer
  * Number of shields a tribe is allowed to have.
  * Default is 1.

GameUserSettings.ini:
```
[SafeBase]
ShieldSizeMult=1.0
TribeLimit=1
```
## Version 2.1
Correction of the shield which lights up with an opacity of 0, now at 0.8 by default
Fixed crash when opening the opacity window
Graphically reworked opacity window
Removed in INI, no sense in keeping it configurable in the INI only adjustable ingame
MinOpacity=0.50
MaxOpacity=0.80


## Technical Details
##### Mod Id
2386532930

##### Item Class
`SB_PrimalItemStructure_Shield_C`

##### Engram Class
`SB_EngramEntry_Shield_C`

##### Spawn Code
`cheat giveitem "Blueprint'/Game/Mods/SafeBase/Items/SB_PrimalItemStructure_Shield.SB_PrimalItemStructure_Shield'" 1 1 0`

##### Engram Override
`OverrideNamedEngramEntries=(EngramClassName="SB_EngramEntry_Shield_C",EngramLevelRequirement=0,EngramPointsCost=0,EngramHidden=False,RemoveEngramPreReq=False)`

##### Crafting Cost Override
`ConfigOverrideItemCraftingCosts=(ItemClassString="SB_PrimalItemStructure_Shield_C",BaseCraftingResourceRequirements=((ResourceItemTypeString="PrimalItemResource_Thatch_C",BaseResourceRequirement=1.0,bCraftingRequireExactResourceType=True)))`

##### Auto Unlock
`EngramEntryAutoUnlocks=(EngramClassName="B_EngramEntry_Shield_C",LevelToAutoUnlock=0)`
