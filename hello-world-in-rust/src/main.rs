fn main() {
    print!("{}", say_hello());
}

fn say_hello() -> String {
    "Hello, world!".to_string()
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_say_hello() {
        assert_eq!(say_hello(), "Hello, world!")
    }
}
