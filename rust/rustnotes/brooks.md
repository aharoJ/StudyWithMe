# src

- https://crates.io/
- https://tokio.rs/tokio/tutorial/hello-tokio
- https://crates.io/crates/axum

# Injecting Dependencies

```rs
cargo add axum
cargo add tokio
```

## Injecting Features from Dependencies

```rs
 StudyWithMe  rust  brooks  backend  main [ 8 󱅘 35 ] •  via 🦀 v1.78.0 󰁔 cargo add tokio
    Updating crates.io index
      Adding tokio v1.38.0 to dependencies
             Features:
             - bytes
             - fs
             - full
             - io-std
             - io-util
             - libc
             - macros
             - mio
             - net
             - num_cpus
             - parking_lot
             - process
             - rt
             - rt-multi-thread
             - signal
             - signal-hook-registry
             - socket2
             - sync
             - test-util
             - time
             - tokio-macros
             - tracing
             - windows-sys

 StudyWithMe  rust  brooks  backend  main [ 8 󱅘 35 ] •  via 🦀 v1.78.0 󰁔 cargo add tokio -F rt-multi-thread
```

tomm file

```rs
[dependencies]
tokio = { version = "1.38.0", features = ["rt-multi-thread"] }
```

# Run

```rs
cargo run
```
