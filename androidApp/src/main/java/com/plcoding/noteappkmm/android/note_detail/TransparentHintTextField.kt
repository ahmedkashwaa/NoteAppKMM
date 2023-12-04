package com.plcoding.noteappkmm.android.note_detail

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusState
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle

@Composable
fun TransparentHintTextField(
    text:String,
    hint:String,
    isHintVisible:Boolean,
    onValueChanged : (String) ->Unit,
    modifier:Modifier=Modifier,
    textStyle: TextStyle = TextStyle(),
    singleLine:Boolean = false,
    onFocusChange:(FocusState) -> Unit

){
    Box(modifier = modifier) {
        TextField(value = text,
            onValueChange = onValueChanged,
            placeholder = {Text(hint)},
            singleLine = singleLine,
            textStyle = textStyle,
            modifier = Modifier.fillMaxWidth()
                .onFocusChanged {state->
                    onFocusChange(state)
                }
        )
        /*
        if (isHintVisible){
            Text(hint, style = textStyle, color = Color.DarkGray)
        } */
    }
}