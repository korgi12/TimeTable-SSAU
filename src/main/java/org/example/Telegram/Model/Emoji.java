package org.example.Telegram.Model;

import com.vdurmont.emoji.EmojiParser;

public enum Emoji {
    ROCKET(":rocket:"),
    CROWN(":crown:"),
    AUTHOR(":man_technologist:"),
    WELCOME(":wave:"),
    CROSS(":x:"),
    BACK(":leftwards_arrow_with_hook:"),
    MEMO(":memo:"),
    BALLOON(":balloon:"),
    TADA(":tada:"),
    PAST_WEEK(":rewind:"),
    THIS_WEEK(":beach_with_umbrella:"),
    NEXT_WEEK(":fast_forward:"),
    PAINTBRUSH(":lower_left_paintbrush:"),
    RULER(":triangular_ruler:"),
    UNDERAGE(":underage:")
    ;

    private final String value;

    public String get() {
        return EmojiParser.parseToUnicode(value);
    }

    Emoji(String value) {
        this.value = value;
    }
}
