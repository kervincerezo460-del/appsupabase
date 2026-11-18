package com.example.appsupabase.data

import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest
object SupabaseManager {
    val client = createSupabaseClient(
        supabaseUrl = "https://lcfydrwsmzozfjmoppjx.supabase.co",
        supabaseKey ="sb_secret_mE46yNzEBN54hi-mQ2ibhw_nVx-bjJX"
    ) {
        install(Postgrest)
    }
}